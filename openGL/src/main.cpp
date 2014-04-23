/*
 * Projecte de CL 2014
 * 
 * Andrés Mingorance López
 * Albert Puente Encinas
 * 
 */

#include "includes.h"
using namespace std;

// Fotogrames per segon (màxim)
double FPS = 30;

// Mida del tauler (SIZE*SIZE)
const static int SIZE = 11;

// Timer ms
double T = 1000/FPS;

// Increment en el shader de carregar caixes 0..1
double LOAD_SPEED = 0.025; // box

// Última posició del ratolí registrada
int oldMousePositionX, oldMousePositionY; 

// Mida del viewport
double viewportHeight = 800;
double viewportWidth = 800;

// Relacio d'aspecte inicial
double ra = viewportHeight/viewportWidth; 

// Dimensions màximes del model
int xmax, xmin, ymax, ymin, zmax, zmin;
double scale; // Escala del model


// Zoom vigent en les càmeres ortogonals
double zoom = 0.5;

// 0 Perspectiva, 1 Fixa al centre, 2 Segueix al model, 3 Planta, 4 Perfil
int cameraMode = 2;

// Obertura de la càmera perspectiva
double fov = 60;

// Distància entre marques
double distaciaEntreTrails = 0.1;

struct box {
    uint x; // Posició en eix x
    uint z; // Posició en eix z
    float d; // Estat de l'aparició 0..1
    float p; // Estat de la càrrega al model 0..1
};

// Objectes a dibuixar
vector< box > caixes;
vector< pair<uint, uint> > obstacles;
vector <pair<uint, uint> > marques;
vector< pair<double, double> > trail;
Model model;

// Guarda les característiques funcionals del model
robot R;

// Shaders
shader shaderTerra, shaderLlum, shaderCaixa, shaderCaixaCarregada, shaderCaixaLoad, 
        shaderCaixaDrop, shaderObstacle;

// Acció vigent
action currentAction;

// Flag d'acabament
bool finish = false;

// Símil de temps per a l'oscil·lació de les caixes carregades
double O = 0; 

// Contador de temps en STOP
double stoppedTime = 0;

// Sincronització entre threads
/*
condition_variable cv;
mutex cv_m;
atomic<int> waitMainThread{1};
*/

void pintaModel() { 
    shaderLlum.on();
    glPushMatrix();
    float v1[3] = {0.9, 0.9, 0.9};
    glMaterialfv(GL_FRONT_AND_BACK, GL_DIFFUSE, v1);
    float v2[3] = {1, 1, 1};
    glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, v2);
    float v3[3] = {0.1, 0.1, 0.1};
    glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, v3);
    glTranslatef(R.getX(), 0, R.getZ());   
    glRotatef(R.getAng()*180/M_PI, 0, 1, 0);      
    glScalef(scale, scale, scale); 
    glTranslatef(-(xmax-((xmax-xmin)/2)), -ymin, -(zmax-((zmax-zmin)/2)));      
    plotterModel(model);
    glPopMatrix();
    shaderLlum.off();    
    if (R.hasABox()) {        
        shaderCaixaCarregada.on();
        double t = time(0)*1000;
        shaderCaixaCarregada.passUniform("nfrac", 1);
        shaderCaixaCarregada.passUniform("time", O);
        O += 0.2;
        glPushMatrix();
        plotterBox(R.getX(), R.getZ(), 1);
        glPopMatrix();
        shaderCaixaCarregada.off();
    }
}

void pintaTerra() {
    shaderTerra.on(); 
    glPushMatrix();
    plotterGround(SIZE); 
    glPopMatrix();
    shaderTerra.off();
}

void pintaMarques() {    
    glColor4f(0.0, 1.0, 0.0, 0.25);
    glEnable(GL_BLEND);
    glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    for (int i = 0; i < marques.size(); ++i) {
        int x = marques[i].first;
        int z = marques[i].second;
        glPushMatrix();
        plotterMark(x, z); 
        glPopMatrix();
    }
    glDisable(GL_BLEND);     
}

void pintaCaixes() {
    shaderCaixa.on();
    for (int i = 0; i < caixes.size(); ++i) {
        int x = caixes[i].x;
        int z = caixes[i].z;
        if (caixes[i].d < 1) { // Creació
            shaderCaixa.off();
            shaderCaixaDrop.on();
            shaderCaixaDrop.passUniform("alpha", caixes[i].d);
            glPushMatrix();
            plotterBox(x, z, 0); 
            glPopMatrix();
            shaderCaixaDrop.off();
            shaderCaixa.on();
        }
        else if (caixes[i].p > 0 and caixes[i].p < 1) { // Càrrega al model
            shaderCaixa.off();
            shaderCaixaLoad.on();
            float dx = R.getX()-x;
            float dz = R.getZ()-z;
            float angle = atan2(dx, dz);
            float dist = sqrt(dx*dx + dz*dz);
            shaderCaixaLoad.passUniform("ang", angle);
            shaderCaixaLoad.passUniform("dist", dist);
            shaderCaixaLoad.passUniform("nfrac", caixes[i].p);
            glPushMatrix();
            plotterBox(x, z, 0); 
            glPopMatrix();
            shaderCaixaLoad.off();
            shaderCaixa.on();
        }
        else { // Normal / Estàtica en el terra
            glPushMatrix();
            plotterBox(x, z, 0); 
            glPopMatrix();
        }
    }
    shaderCaixa.off();
}

void pintaObstacles() {
    shaderObstacle.on();
    for (int i = 0; i < obstacles.size(); ++i) {
        int x = obstacles[i].first;
        int z = obstacles[i].second;
        glPushMatrix();
        plotterObstacle(x, z); 
        glPopMatrix();
    }
    shaderObstacle.off();       
}

void pintaRastre() {
    glEnable(GL_BLEND);
    glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    glColor4f(0.2, 0.2, 1, 0.5);
    for (int i = 0; i < trail.size(); ++i) {
        double x = trail[i].first;
        double z = trail[i].second;
        glPushMatrix();
        plotterTrail(x, z); 
        glPopMatrix();
    } 
    glDisable(GL_BLEND);
}

void computeTrail() {        
    if (trail.size() > 0) {
        double d1 = trail.back().first - R.getX();
        double d2 = trail.back().second - R.getZ();
        if (sqrt(pow(d1, 2) + pow(d2, 2)) > distaciaEntreTrails) trail.push_back(make_pair(R.getX(), R.getZ()));
    }
    else trail.push_back(make_pair(R.getX(), R.getZ()));
}
    
void refresh() {    
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);     
    pintaTerra();
    pintaMarques();
    pintaRastre();
    pintaCaixes();
    pintaObstacles();
    pintaModel();
    glutSwapBuffers();    
}

void changeCameraOrtho() {
    glMatrixMode(GL_PROJECTION);    
    glLoadIdentity();
    if (ra >= 1) glOrtho(-ra*10*zoom, ra*10*zoom, -10*zoom, 10*zoom, -SIZE, SIZE*2);
    else glOrtho(-10*zoom , 10*zoom, -(10/ra)*zoom, (10/ra)*zoom, -SIZE, SIZE*2);    
    glMatrixMode(GL_MODELVIEW);
}

void changeCameraPerspective() {
    glMatrixMode(GL_PROJECTION); 
    glLoadIdentity();             
    gluPerspective(fov, ra, 0.01, 2*SIZE);
    glMatrixMode(GL_MODELVIEW); 
}

void moveCamera() {
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();   
    if (cameraMode == 0) { // Perspectiva
        gluLookAt(R.getX()-sin(R.getAng()), 1, R.getZ()-cos(R.getAng()),
                    R.getX(), 0.5, R.getZ(),
                    0, 1, 0);
        changeCameraPerspective();
    }
    else {
        double offset = ((double) SIZE)/2;
        if (cameraMode == 1) { // Fixa al centre    
            gluLookAt(offset+5, 5, offset+5,
                        offset, 0, offset,
                        0, 1, 0);
        }
        else if (cameraMode == 2) { // Segueix al robot
            gluLookAt(R.getX()+5, 5, R.getZ()+5,
                        R.getX(), 0, R.getZ(),
                        0, 1, 0);
        } else if (cameraMode == 3) { // Planta
            gluLookAt(R.getX(), 5, R.getZ(),
                        R.getX(), 0, R.getZ(),
                        0, 0, -1);
        } else if (cameraMode == 4) { // Perfil
            gluLookAt(SIZE+1, 0.5, R.getZ(),
                        0, 0.5, R.getZ(),
                        0, 1, 0);
        }
        
        changeCameraOrtho();
    }
}

void resize(int ample, int alt) {  
    glViewport(0, 0, ample, alt);
    ra = (double)ample/(double)alt;
    moveCamera();
}

void click(int pressedButton, int mode, int pX, int pY) {
    oldMousePositionX = pX;
    oldMousePositionY = pY;   
}

void drag(int posX, int posY) {    
    if (cameraMode == 0) {
        fov -= 0.1*(oldMousePositionY-posY);
        if (fov < 10) fov = 10;
        else if (fov > 120) fov = 120;
    }
    else {
        zoom -= 0.001*(oldMousePositionY-posY);
        if (zoom < 0.1) zoom = 0.1;
        else if (zoom > 0.8) zoom = 0.8;
    }
    oldMousePositionX = posX;
    oldMousePositionY = posY;  
    moveCamera();
}

void keyPressed(unsigned char character, int posX, int posY) {
    if (character == 27) exit(0); // ESC tanca la finestra    
    else if (character == 'c' or character == 'C') {
        if (++cameraMode > 4) cameraMode = 0;
    }
    moveCamera();
}

void initGLUT() {     
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGBA | GLUT_DEPTH | GLUT_MULTISAMPLE);
    glutInitWindowSize(viewportHeight, viewportWidth);
    glutCreateWindow("Projecte CL : robotGL");
    glutReshapeFunc(resize);
    glutDisplayFunc(refresh);
    glutMouseFunc(click);
    glutMotionFunc(drag);    
    glutKeyboardFunc(keyPressed);
}

void initCamera() {    
    changeCameraOrtho();
    moveCamera();    
}

void initGL() {
    glEnable(GL_DEPTH_TEST);
    glClearColor(0.7, 0.7, 0.7, 0);     
    glPolygonMode(GL_FRONT_AND_BACK, GL_FILL);    
    glEnable(GL_NORMALIZE);
    glEnable(GL_CULL_FACE); // Filtrar cares no visibles
    glEnable(GL_TEXTURE_2D); // Textures
    glEnable(GL_MULTISAMPLE_ARB); // Antialiasing
    glDisable(GL_LIGHTING); // Iluminacio per shaders propis
    glDisable(GL_BLEND);
}

void calcularLimits() {
    vector<double> V = model.vertices();  
    xmax = ymax = zmax = INT_MIN;
    xmin = ymin = zmin = INT_MAX;
    for (int i = 0; i < V.size(); i += 3) {
        if (V[i] > xmax) xmax = V[i];
        if (V[i] < xmin) xmin = V[i];
        if (V[i+1] > ymax) ymax = V[i+1];
        if (V[i+1] < ymin) ymin = V[i+1];
        if (V[i+2] > zmax) zmax = V[i+2];
        if (V[i+2] < zmin) zmin = V[i+2];
    }
    scale = 0.8/((double)max((zmax-zmin), (xmax-xmin))); // Mesura 0.325 de radi MAX
}

double diff(double x, double y) {
    return (x > y ? x - y : y - x);
}

double distanciaQuadrat(double x1, double z1, double x2, double z2, double radiQ) {
    double angleQ = fabs(fmod(atan2(x2-x1,z2-z1), M_PI/2));
    double dQ;
    if (angleQ < M_PI/4) dQ = radiQ/cos(angleQ);
    else dQ = radiQ/cos(M_PI/2-angleQ);
    double dist = sqrt(pow(diff(x1,x2),2)+pow(diff(z1,z2),2));
    return sqrt(pow(diff(x1,x2),2)+pow(diff(z1,z2),2))-dQ;
}

bool detect(double dist, double& minDist) {
    minDist = 2*SIZE;
    double x = R.getX();
    double z = R.getZ();
    for (int i = 0; i < obstacles.size(); ++i) {
        double dQ = distanciaQuadrat(x, z, obstacles[i].first, obstacles[i].second, 0.5);
        minDist = min(minDist, dQ);
    }    
    for (int i = 0; i < caixes.size(); ++i) {
        double dQ = distanciaQuadrat(x, z, caixes[i].x, caixes[i].z, 0.25);
        minDist = min(minDist, dQ);
    }
    return (dist >= minDist);
}

bool detect(double dist) {
    double x = R.getX();
    double z = R.getZ();
    for (int i = 0; i < obstacles.size(); ++i) {
        double dQ = distanciaQuadrat(x, z, obstacles[i].first, obstacles[i].second, 0.5);
        if (dist >= dQ) return true;
    }
    for (int i = 0; i < caixes.size(); ++i) {
        double dQ = distanciaQuadrat(x, z, caixes[i].x, caixes[i].z, 0.25);
        if (dist >= dQ) return true;
    }
    return false;
}

void loadBox() {
    double x1 = R.getX();
    double z1 = R.getZ();
    bool found = false;
    for (int i = 0; i < caixes.size() and not found; ++i) {
        double x2 = caixes[i].x;
        double z2 = caixes[i].z;
        double distancia = sqrt(pow(diff(x1,x2),2)+pow(diff(z1,z2),2));
        if (distancia <= 1) {
            found = true;
            caixes[i].p += LOAD_SPEED;
        }
    }
    if (not found) {
        cout << "ACCIÓ IGNORADA: PICK_OBJECT    | No hi ha cap caixa a l'abast" << endl;
        currentAction.setStatus(FINISHED);
    }
    else {
        currentAction.setStatus(RUNNING);
    }
}

bool ocupat(int x, int z) {    
    for (int i = 0; i < obstacles.size(); ++i) {
        if (x == obstacles[i].first and z == obstacles[i].second) return true;
    }
    for (int i = 0; i < caixes.size(); ++i) {
        if (x == caixes[i].x and z == caixes[i].z) return true;
    }
    return false;    
}

bool detectDirection(double direccio) {
    int x1 = (int) (R.getX()+0.5);
    int z1 = (int) (R.getZ()+0.5);
    double ang = fmod(R.getAng()+direccio, 2*M_PI);        
    int x2 = (int) (x1+sin(ang)+0.5);
    int z2 = (int) (z1+cos(ang)+0.5);
    return ocupat(x2, z2);
}

void leaveBox() {
    double x1 = R.getX();
    double z1 = R.getZ();
    double ang = R.getAng();
    for (double inc = 0; inc < 2*M_PI and R.hasABox(); inc += M_PI/4) {        
        int x2 = (int) x1+sin(ang+inc);
        int z2 = (int) z1+cos(ang+inc);    
        double distancia = distanciaQuadrat(x1, z1, x2, z2, 0.25);
        if (not ocupat(x2, z2) and distancia > 0.4 and x2 >= 0 and z2 >= 0 and x2 < SIZE and z2 < SIZE) {
            box n;
            n.x = x2;
            n.z = z2;
            n.d = 1;
            n.p = 1 - LOAD_SPEED;
            caixes.push_back(n);
            R.setBox(false);
        }
    }
    if (R.hasABox()) {
        cout << "ACCIÓ IGNORADA: RELEASE_OBJECT | No hi ha cap espai on deixar la caixa" << endl;
        currentAction.setStatus(FINISHED);
    }
    else {
        currentAction.setStatus(RUNNING);
    }
}

// Switch per la inicialització d'accions
void iniciarAccio() {
    double ang;
    switch (currentAction.getType()) {
        
        case BOX :
            if (not ocupat(currentAction.getDestX(), currentAction.getDestZ())) {
                box n;
                n.x = currentAction.getDestX();
                n.z = currentAction.getDestZ();
                n.d = n.p = 0;
                caixes.push_back(n);
                currentAction.setStatus(RUNNING);
            }
            else {
                cout << "ACCIÓ IGNORADA: BOX            | Ja hi ha un objecte en la posició" << endl;
                currentAction.setStatus(FINISHED);
            }
            break;
            
        case OBSTACLE :
            if (not ocupat(currentAction.getDestX(), currentAction.getDestZ())) {
                obstacles.push_back( make_pair( currentAction.getDestX(), currentAction.getDestZ()));
            }
            else {
                cout << "ACCIÓ IGNORADA: OBSTACLE       | Ja hi ha un objecte en la posició" << endl;
            }
            currentAction.setStatus(FINISHED);
            break;
            
        case TRAIL :
            currentAction.getDestAng() > 0 ? R.setTrail(true) : R.setTrail(false);
            currentAction.setStatus(FINISHED);
            break;
            
        case MARK : 
            marques.push_back( make_pair( currentAction.getDestX(), currentAction.getDestZ()));        
            currentAction.setStatus(FINISHED);
            break;
            
        case PICK_OBJECT :
            if (not R.hasABox()) loadBox();
            else {
                currentAction.setStatus(FINISHED);
                cout << "ACCIÓ IGNORADA: PICK_OBJECT    | Ja es porta una caixa" << endl;
            }
            break;
    
        case RELEASE_OBJECT :
            if (R.hasABox()) leaveBox();
            else {
                currentAction.setStatus(FINISHED);
                cout << "ACCIÓ IGNORADA: RELEASE_OBJECT | No es porta cap caixa" << endl;
            }
            break;
        
        case STOP :
            stoppedTime = 0;
            currentAction.setStatus(RUNNING);
            break;
        
        case MOVE_FORWARD : // falta informacio de desti
            currentAction.setDest(R.getX()+currentAction.getDestAng()*sin(R.getAng()), 
                                  R.getZ()+currentAction.getDestAng()*cos(R.getAng()));
            currentAction.setStatus(RUNNING);
            R.newAction(&currentAction);  
            break;
        
        case ROTATE :
            ang = currentAction.getDestAng() * M_PI/180;
            if (ang < 0) ang += 2*M_PI;
            currentAction.setDestAng(ang);
            currentAction.setStatus(RUNNING);
            R.newAction(&currentAction);  
            break;
       
        default :
            currentAction.setStatus(RUNNING);
            R.newAction(&currentAction);
    }
}


void exec(const action& act) {
    currentAction = act;
    currentAction.setStatus(START);
    while (currentAction.getStatus() != FINISHED) {    
        
        // Comprova que no hagi sortit del camp
        if (R.getX() < -0.5 or R.getZ() < -0.5 or R.getX() >  SIZE -0.5 or R.getZ() >  SIZE-0.5) {
            currentAction.setStatus(FINISHED);         
            if (not finish) {
                finish = true;
                cout << "FI DE LA EXECUCIÓ          | Fora del mapa" << endl;
            }
        }   
        // S'espera a que es faci un resfresc de pantalla per actualitzar les variables de nou
        // Com a molt espera 1 segon.
        /*unique_lock<std::mutex> lk(cv_m);
        cv.wait_for(lk, chrono::milliseconds(1000), [](){ return waitMainThread == 0; });*/
        double d1,d2;
        double px = R.getX();
        double pz = R.getZ();
        detect(0.4, d1);        
        if (currentAction.getStatus() == START) iniciarAccio();
        if (currentAction.getStatus() == RUNNING) {
            if (currentAction.getType() == BOX) {
                for (int i = 0; i < caixes.size(); ++i) {
                    if (caixes[i].d < 1) caixes[i].d += 0.025;
                    if (caixes[i].d > 1) {
                        caixes[i].d = 1;
                        currentAction.setStatus( FINISHED );
                    }
                }
            }
            else if (currentAction.getType() == PICK_OBJECT) {
                for (int i = 0; i < caixes.size(); ++i) {
                    if (caixes[i].p > 0 and caixes[i].p < 1) caixes[i].p += LOAD_SPEED;
                    if (caixes[i].p >= 1) {
                        caixes.erase(caixes.begin()+i);
                        currentAction.setStatus( FINISHED );
                        R.setBox(true);
                    }
                }
            }
            else if (currentAction.getType() == RELEASE_OBJECT) {
                for (int i = 0; i < caixes.size(); ++i) {
                    if (caixes[i].p > 0 and caixes[i].p < 1) caixes[i].p -= LOAD_SPEED;
                    if (caixes[i].p < 0) {
                        caixes[i].p = 0;
                        currentAction.setStatus( FINISHED );
                    }
                }
            }
            else if (currentAction.getType() == STOP) {
                stoppedTime += T;
                if (stoppedTime >= currentAction.getDestAng()*1000) {
                    currentAction.setStatus(FINISHED);
                }
            }
            else {
                R.update(); // pot ser accio instantania
            }
        }
        if (R.trailOn()) computeTrail();
        actionName type = currentAction.getType();
        if (detect(0.4, d2)) {  // <- PROVISIONAL, no permet empitjorar la col·lisio            
            if (d1 >= d2 and (type == MOVE or type == MOVE_FORWARD)) {
                currentAction.setStatus(FINISHED); 
                if (type == MOVE_FORWARD) {
                    cout << "ACCIÓ IGNORADA: MOVE_FORWARD   | Col·lisió" << endl;
                }
                else {
                    cout << "ACCIÓ IGNORADA: MOVE       | Col·lisió" << endl;
                }                
            }
            R.setX(px);
            R.setZ(pz);
        }
        
        if (currentAction.getStatus() != FINISHED or type == MOVE or type == MOVE_FORWARD or type == ROTATE) {
            usleep(T*1000);
            /*waitMainThread = 1; 
            cv.notify_all();*/
        }
    }       
}

double angleActual() {
    return R.getAng()*180/M_PI; 
}

void updateTimer(int v) {
    /*if (not finish) { // Espera a que s'hagin actualitzat les variables
        unique_lock<std::mutex> lk(cv_m);
        cv.wait_for(lk, chrono::milliseconds(1000), [](){ return waitMainThread == 1; });   
    }*/
    long double t1 = time(0)*1000;
    moveCamera();
    glutPostRedisplay();        
    long double t2 = time(0)*1000;
    // Només cal esperar el temps no gastat pel següent frame
    long double wait = ((T-(t2-t1)) < 0) ? 0 : (T-(t2-t1));
    // Dona permís al thread d'actualitzar variables
    /*waitMainThread = 0;
    cv.notify_all();*/
    glutTimerFunc(wait, updateTimer, 0);    
}

void actions(); // Permèt afegir la funció al final de l'arxiu
    
int main(int argc, const char * argv[]) {
    glutInit(&argc, (char **) argv);
    initGLUT();    
    initGL();
    
    model.load("res/petit2.obj");
    calcularLimits();
    
    initCamera();  

    // Càrrega dels shaders (carpeta /res per defecte)

    shaderTerra = shader("BT.vert", "BT.frag");
    shaderTerra.loadImg("mine.png");

    shaderCaixa= shader("BT.vert", "BT.frag");
    shaderCaixa.loadImg("box.jpg");
       
    shaderCaixaCarregada = shader("BTflotant.vert", "BTflotant.frag");
    shaderCaixaCarregada.loadImg("box.jpg");
    
    shaderCaixaDrop = shader("Drop.vert", "BT.frag");
    shaderCaixaDrop.loadImg("box.jpg");
    
    shaderCaixaLoad = shader("Load.vert", "BTflotant.frag");
    shaderCaixaLoad.loadImg("box.jpg");
    
    shaderObstacle = shader("BT.vert", "BT.frag");
    shaderObstacle.loadImg("obs.png");
    
    shaderLlum = shader("L.vert", "L.frag");
    
    // Crida del thread d'actualització de variables, i inicialització del timer de glut
    
    cout << "Inici de la simulació..." << endl;
    thread t(actions);
    glutTimerFunc(T, updateTimer, 0);
    glutMainLoop();
}

// Accions: traduccio de robotGL a c++



void rgl_buildMap() {
    exec( action(OBSTACLE, 0, 1) );
    exec( action(OBSTACLE, 0, 3) );
    exec( action(OBSTACLE, 0, 5) );
    exec( action(OBSTACLE, 0, 7) );
    exec( action(OBSTACLE, 0, 9) );
    exec( action(OBSTACLE, 1, 1) );
    exec( action(OBSTACLE, 1, 3) );
    exec( action(OBSTACLE, 1, 5) );
    exec( action(OBSTACLE, 1, 7) );
    exec( action(OBSTACLE, 1, 9) );
    exec( action(OBSTACLE, 2, 1) );
    exec( action(OBSTACLE, 2, 3) );
    exec( action(OBSTACLE, 2, 7) );
    exec( action(OBSTACLE, 2, 9) );
    exec( action(OBSTACLE, 3, 1) );
    exec( action(OBSTACLE, 3, 3) );
    exec( action(OBSTACLE, 3, 5) );
    exec( action(OBSTACLE, 3, 7) );
    exec( action(OBSTACLE, 3, 9) );
    exec( action(OBSTACLE, 4, 1) );
    exec( action(OBSTACLE, 4, 3) );
    exec( action(OBSTACLE, 4, 5) );
    exec( action(OBSTACLE, 4, 7) );
    exec( action(OBSTACLE, 5, 1) );
    exec( action(OBSTACLE, 5, 3) );
    exec( action(OBSTACLE, 5, 5) );
    exec( action(OBSTACLE, 5, 7) );
    exec( action(OBSTACLE, 5, 9) );
    exec( action(OBSTACLE, 6, 1) );
    exec( action(OBSTACLE, 6, 3) );
    exec( action(OBSTACLE, 6, 5) );
    exec( action(OBSTACLE, 6, 7) );
    exec( action(OBSTACLE, 6, 9) );
    exec( action(OBSTACLE, 7, 1) );
    exec( action(OBSTACLE, 7, 3) );
    exec( action(OBSTACLE, 7, 5) );
    exec( action(OBSTACLE, 7, 7) );
    exec( action(OBSTACLE, 7, 9) );
    exec( action(OBSTACLE, 8, 1) );
    exec( action(OBSTACLE, 8, 3) );
    exec( action(OBSTACLE, 8, 5) );
    exec( action(OBSTACLE, 8, 7) );
    exec( action(OBSTACLE, 8, 9) );
    exec( action(OBSTACLE, 9, 1) );
    exec( action(OBSTACLE, 9, 3) );
    exec( action(OBSTACLE, 9, 5) );
    exec( action(OBSTACLE, 9, 7) );
    exec( action(OBSTACLE, 9, 9) );
    exec( action(OBSTACLE, 10, 5) );
    exec( action(OBSTACLE, 10, 9) );
    exec( action(BOX, 3, 0) );
}

void rgl_moveinf() {
    while (not detectDirection(0)) {
        exec( action(MOVE_FORWARD, 1) );
    }
}

void rgl_fetch() {
    while (not detectDirection(0)) {
        exec( action(MOVE_FORWARD, 1) );
    }
    exec( action(PICK_OBJECT) );
}

void rgl_traverse() {
    while (not detectDirection(90) and not detectDirection(-90)) {
        if (detectDirection(0)) {
            exec( action(ROTATE, angleActual() + 180) );
        }
        exec( action(MOVE_FORWARD, 1) );
    }
    if (detectDirection(90)) {
        exec( action(ROTATE, angleActual() + 270) );
    }
    else {
        exec( action(ROTATE, angleActual() + 90) );
    }
    exec( action(MOVE_FORWARD, 2) );
    exec( action(ROTATE, angleActual() + 90) );
    if (R.getIntX() != 10 or R.getIntZ() != 10) {
        rgl_traverse();
    }
}

void actions() {
    R = robot(0, 0, 0);
    rgl_buildMap();
    rgl_fetch();
    rgl_traverse();
    finish = true;
}
