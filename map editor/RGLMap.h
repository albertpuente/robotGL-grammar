#include <QFrame>
#include "RGLCell.h"
using namespace std;

class RGLMap: public QFrame {
Q_OBJECT

private:
    pair<int, int> mapsize;
    bool numbersOn;
    QWidget* parent;
    vector<vector<RGLCell*> > cells;
    
    void createCells();
    void updateCells(pair<int,int> newsize);
    void deleteCells(pair<int,int> newsize);
    void recalcMinimumSize(QWidget*);
    void resizeCells();
    void reallocateCells();
    void resizeEvent (QResizeEvent * event);
    
public:
	RGLMap(QWidget *parent);

public slots:
    void setRows(int n);
	void setCols(int n);
	void toggleNumbers();
    void printTemplate();
    void resetCells();
    
signals:

};

//--robotGL3
