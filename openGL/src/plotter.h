#include <GL/gl.h>

void plotterModel(Model& model) {
    int mat = -1;
    const vector<Face> faces = model.faces();    
    for (int i = 0; i < faces.size(); ++i) { 
        const Face f = faces[i];          
        if (f.mat != mat) {
            mat = f.mat;            
                glNormal3d(f.normalC[0], f.normalC[1], f.normalC[2]);      
                glMaterialfv(GL_FRONT_AND_BACK, GL_DIFFUSE, Materials[f.mat].diffuse);
                glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, Materials[f.mat].specular);
                glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, Materials[f.mat].ambient);
                glMaterialf(GL_FRONT_AND_BACK, GL_SHININESS , Materials[f.mat].shininess);     
        }
        glColor4fv(Materials[f.mat].diffuse);      
        glBegin(GL_TRIANGLES);
        for (int j = 0; j < 3; ++j) {
                glNormal3dv(&model.normals()[f.n[j]]);   
                glVertex3dv(&model.vertices()[f.v[j]]);
        }
        glEnd();        
    }
}

void plotterGround(int size) {
    int t = size - 1;
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(-0.5, 0, -0.5);
        glTexCoord2f(0, size);    glVertex3f(-0.5, 0, t+0.5);
        glTexCoord2f(size, size);   glVertex3f(t+0.5, 0, t+0.5);
        glTexCoord2f(size, 0);    glVertex3f(t+0.5, 0, -0.5);        
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(-0.5, -0.25, t+0.5);
        glTexCoord2f(0, -size);     glVertex3f(t+0.5, -0.25, t+0.5);
        glTexCoord2f(0.25, -size);     glVertex3f(t+0.5, 0, t+0.5);
        glTexCoord2f(0.25, 0);     glVertex3f(-0.5, 0, t+0.5);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(t+0.5, 0, -0.5);
        glTexCoord2f(0, -size);     glVertex3f(t+0.5, 0, t+0.5);
        glTexCoord2f(0.25, -size);     glVertex3f(t+0.5, -0.25, t+0.5);
        glTexCoord2f(0.25, 0);     glVertex3f(t+0.5, -0.25, -0.5);  
    glEnd();
}

void plotterBox(double x, double z, double height) {
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x-0.25, height+0.5, z-0.25);
        glTexCoord2f(0, 1);     glVertex3f(x-0.25, height+0.5, z+0.25);
        glTexCoord2f(1, 1);     glVertex3f(x+0.25, height+0.5, z+0.25);
        glTexCoord2f(1, 0);     glVertex3f(x+0.25, height+0.5, z-0.25);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x-0.25, height, z+0.25);
        glTexCoord2f(0, 1);     glVertex3f(x+0.25, height, z+0.25);
        glTexCoord2f(1, 1);     glVertex3f(x+0.25, height+0.5, z+0.25);
        glTexCoord2f(1, 0);     glVertex3f(x-0.25, height+0.5, z+0.25);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x+0.25, height+0.5, z-0.25);
        glTexCoord2f(0, 1);     glVertex3f(x+0.25, height+0.5, z+0.25);
        glTexCoord2f(1, 1);     glVertex3f(x+0.25, height, z+0.25);
        glTexCoord2f(1, 0);     glVertex3f(x+0.25, height, z-0.25);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x-0.25, height+0.5, z+0.25);
        glTexCoord2f(0, 1);     glVertex3f(x-0.25, height+0.5, z-0.25);
        glTexCoord2f(1, 1);     glVertex3f(x-0.25, height, z-0.25);
        glTexCoord2f(1, 0);     glVertex3f(x-0.25, height, z+0.25);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x+0.25, height, z-0.25);  
        glTexCoord2f(0, 1);     glVertex3f(x-0.25, height, z-0.25);
        glTexCoord2f(1, 1);     glVertex3f(x-0.25, height+0.5, z-0.25);
        glTexCoord2f(1, 0);     glVertex3f(x+0.25, height+0.5, z-0.25);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x-0.25, height, z-0.25);
        glTexCoord2f(1, 0);     glVertex3f(x+0.25, height, z-0.25);
        glTexCoord2f(1, 1);     glVertex3f(x+0.25, height, z+0.25);
        glTexCoord2f(0, 1);     glVertex3f(x-0.25, height, z+0.25);
    glEnd();
}

void plotterMark(int x, double y, int z) {   

    glBegin(GL_POLYGON);    
        glVertex3f(x, y, z+0.2);
        glVertex3f(x+0.2, y, z+0.4);
        glVertex3f(x+0.4, y, z+0.2);
        glVertex3f(x+0.2, y, z);
        glVertex3f(x+0.4, y, z-0.2);
        glVertex3f(x+0.2, y, z-0.4);
        glVertex3f(x, y, z-0.2);
        glVertex3f(x-0.2, y, z-0.4);
        glVertex3f(x-0.4, y, z-0.2);
        glVertex3f(x-0.2, y, z);
        glVertex3f(x-0.4, y, z+0.2);
        glVertex3f(x-0.2, y, z+0.4);
        
    glEnd();    
}

void plotterObstacle(int x, int z) {
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x-0.5, 0.75, z-0.5);
        glTexCoord2f(0, 1);     glVertex3f(x-0.5, 0.75, z+0.5);
        glTexCoord2f(1, 1);     glVertex3f(x+0.5, 0.75, z+0.5);
        glTexCoord2f(1, 0);     glVertex3f(x+0.5, 0.75, z-0.5);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x-0.5, 0, z+0.5);
        glTexCoord2f(0, 1);     glVertex3f(x+0.5, 0, z+0.5);
        glTexCoord2f(0.75, 1);     glVertex3f(x+0.5, 0.75, z+0.5);
        glTexCoord2f(0.75, 0);     glVertex3f(x-0.5, 0.75, z+0.5);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x+0.5, 0.75, z-0.5);
        glTexCoord2f(0, 1);     glVertex3f(x+0.5, 0.75, z+0.5);
        glTexCoord2f(0.75, 1);     glVertex3f(x+0.5, 0, z+0.5);
        glTexCoord2f(0.75, 0);     glVertex3f(x+0.5, 0, z-0.5);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x-0.5, 0.75, z+0.5);
        glTexCoord2f(0, 1);     glVertex3f(x-0.5, 0.75, z-0.5);
        glTexCoord2f(0.75, 1);     glVertex3f(x-0.5, 0, z-0.5);
        glTexCoord2f(0.75, 0);     glVertex3f(x-0.5, 0, z+0.5);  
    glEnd();
    glBegin(GL_POLYGON);
        glTexCoord2f(0, 0);     glVertex3f(x+0.5, 0, z-0.5);  
        glTexCoord2f(0, 1);     glVertex3f(x-0.5, 0, z-0.5);
        glTexCoord2f(0.75, 1);     glVertex3f(x-0.5, 0.75, z-0.5);
        glTexCoord2f(0.75, 0);     glVertex3f(x+0.5, 0.75, z-0.5);  
    glEnd();
}

void plotterTrail(double x, double z) {
    glBegin(GL_POLYGON);
        glVertex3f(x-0.025, 0.002, z-0.025);
        glVertex3f(x-0.025, 0.002, z+0.025);
        glVertex3f(x+0.025, 0.002, z+0.025);
        glVertex3f(x+0.025, 0.002, z-0.025);
    glEnd();
}