#include <QPushButton>

class RGLCell: public QPushButton {
Q_OBJECT

private:
    int type;
    int i, j;
    bool showNumbers;    
    
    void setColors();
    
public:
	RGLCell(QWidget *parent, int i, int j);
	    
    int getType();
    void setType(int type);
    void toggleNumbers(bool on);    
    
public slots:
	void changeType();
    
signals:

};

