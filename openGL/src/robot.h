#include "action.h"
#include <math.h>
#include <stdlib.h> 

class robot {
public:
    robot();
    robot(double initX, double initZ, double initAng);
    void newAction(action* a);
    void update();
    double getX();
    double getZ();  
    void setX(double x);
    void setZ(double z);
    double getAng();
    void finish();
    void setTrail(bool b);
    bool trailOn();
    bool hasABox();
    void setBox(bool b);
    
private:
    double posModelZ;
    double posModelX;
    double ang;
    double speed;
    action* act;
    bool trail;
    bool box;
    bool end;
    bool needRotate;
    double diff(double x, double y);
    void rotate(double goalAng, double& ang);
    double normAngle(double ang);
};