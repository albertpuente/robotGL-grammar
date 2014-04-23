#include "robot.h"

const double SPEED = 0.05;

robot::robot() {
    posModelX = 0;
    posModelZ = 0;
    ang = 0;
    needRotate = true;
    trail = false;
    box = false;
}

robot::robot(double initX, double initZ, double initAng) {
    posModelX = initX;
    posModelZ = initZ;
    ang = fmod(initAng* M_PI/180, 2*M_PI);
    needRotate = true;
    trail = false;
    box = false;
}

void robot::newAction(action* a) {
    act = a;    
    needRotate = true;
}

double robot::diff(double x, double y) {
    return (x > y ? x - y : y - x);
}

double robot::normAngle(double ang) {
    if (ang >= 2*M_PI) ang -= 2*M_PI;
    else if (ang < 0) ang += 2*M_PI;    
    return ang;
}

void robot::rotate(double goalAng, double& ang) {
    double dl, dr;
    if (goalAng > ang) {
        dl = 2*M_PI - goalAng + ang;
        dr = goalAng - ang;
    }
    else {
        dl = ang - goalAng;
        dr = 2*M_PI - ang + goalAng;                        
    }
    dl < dr ? ang -= 0.05 : ang += 0.05;     
    ang = normAngle(ang);
}

void robot::update() {
    if (act->getStatus() != FINISHED) {  
        if (act->getType() == MOVE) {
            if (needRotate) {                
                double goalAng = normAngle(atan2((act->getDestX()-posModelX),(act->getDestZ()-posModelZ)));
                double dif = diff(goalAng, ang);
                if (dif <= 0.03 or dif >= 2*M_PI - 0.03 ) {
                    ang = goalAng;               
                    needRotate = false;                  
                }
                else {
                    rotate(goalAng, ang);
                }
            }
            else {
                posModelX += sin(ang)*SPEED;     
                posModelZ += cos(ang)*SPEED;
            }
            if (diff(act->getDestX(),posModelX) <=  SPEED/2 and diff(act->getDestZ(),posModelZ) <=  SPEED/2) {
                posModelX = act->getDestX();
                posModelZ = act->getDestZ();
                act->setStatus(FINISHED);
                needRotate = true; 
            }
        }
        else if (act->getType() == ROTATE) {
            double goalAng = normAngle(act->getDestAng());
            double dif = diff(goalAng, ang);
            if (dif <= 0.03 or dif >= 2*M_PI - 0.03 ) {
                ang = goalAng;               
                act->setStatus(FINISHED);                    
            }
            else {
                rotate(goalAng, ang);   
            }
        }
        else if (act->getType() == MOVE_FORWARD) {
            posModelX += sin(ang)*SPEED;     
            posModelZ += cos(ang)*SPEED;
            if (diff(act->getDestX(),posModelX) <=  SPEED/2 and diff(act->getDestZ(),posModelZ) <=  SPEED/2) {
                posModelX = act->getDestX();
                posModelZ = act->getDestZ();
                act->setStatus(FINISHED);
            }
        }
    }    
}

double robot::getX() {
    return posModelX;
}

double robot::getZ() {
    return posModelZ;
}

double robot::getIntX() {
    return ((int) (0.5 + posModelX));
}

double robot::getIntZ() {
    return ((int) (0.5 + posModelZ));
}

void robot::setX(double x) {
    posModelX = x;
}

void robot::setZ(double z) {
    posModelZ = z;
}

double robot::getAng() {
    return ang;
}

void robot::setTrail(bool b) {
    trail = b;
}

bool robot::trailOn() {
    return trail;
}

bool robot::hasABox() {
    return box;
}

void robot::setBox(bool b) {
    box = b;
}