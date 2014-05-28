#include <QFrame>
#include "RGLCell.h"
using namespace std;

class RGLMap: public QFrame {
Q_OBJECT

private:
    int mapsize;
    bool numbersOn;
    QWidget* parent;
    vector<vector<RGLCell*> > cells;
    
    void createCells();
    void updateCells(int);
    void deleteCells(int);
    void recalcMinimumSize(QWidget*);
    void resizeCells();
    void reallocateCells();
    void resizeEvent (QResizeEvent*);
    
public:
	RGLMap(QWidget *parent);

public slots:
    void setMapSize(int);
	void toggleNumbers();
    void printTemplate();
    void resetCells();
    
signals:

};

//--robotGL3
