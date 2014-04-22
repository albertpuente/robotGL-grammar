#include <iostream>
#include <stack>
#include <string>
using namespace std;

enum actionStatus{ START, RUNNING, FINISHED };

enum actionName { MOVE, MOVE_FORWARD, ROTATE, TRAIL, STOP, MARK,
                    OBSTACLE, BOX, PICK_OBJECT, RELEASE_OBJECT };

class action {
public:
    action();
    action(const action& a);
    action(actionName type, double x, double z);
    action(actionName type, double ang);
    action(actionName type);
    actionName getType() const;
    double getDestX() const;
    double getDestZ() const;
    double getDestAng() const;
    actionStatus getStatus();
    void setStatus(actionStatus s);
    void finish();
    void setDest(double x, double z);
    void setDestAng(double ang);
    
private:
    actionStatus status;
    actionName actionType;
    double goalX;
    double goalZ;
    double goalAng;  
    bool finished;
};