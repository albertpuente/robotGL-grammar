#include "action.h"

action::action() {
    status = START;
}

action::action(const action& a) {
    this->actionType = a.getType();
    this->goalX = a.getDestX();
    this->goalZ = a.getDestZ();
    this->goalAng = a.getDestAng();
    this->status = START;
}

action::action(actionName type, double x, double z) {
    actionType = type;
    goalX = x;
    goalZ = z;
    this->status = START;
}

action::action(actionName type, double ang) {
    actionType = type;
    goalAng = ang;    
    this->status = START;
}

action::action(actionName type) {
    actionType = type;
    this->status = START;
}

actionName action::getType() const {
    return actionType;
}

double action::getDestX() const {
    return goalX;
}

double action::getDestZ() const {
    return goalZ;
}

double action::getDestAng() const {
    return goalAng;
}

actionStatus action::getStatus() {
    return status;
}

void action::setStatus(actionStatus s) {
    status = s;
}

void action::setDest(double x, double z) {
    goalX = x;
    goalZ = z;
}

void action::setDestAng(double ang) {
    goalAng = ang;
}