#include "RGLCell.h"
#include <iostream>
#include <sstream>
using namespace std;

RGLCell::RGLCell(QWidget *parent, int i, int j)
    : QPushButton(parent), type(0), i(i), j(j) {
        connect(this, SIGNAL(clicked()), this, SLOT(changeType()));
                
        toggleNumbers(false);        
        setColors();
}

void RGLCell::changeType () {
    type = (type + 1) % 3;
    setColors();
}

int RGLCell::getType() {
    return type;
}

void RGLCell::setType(int type) {
    this->type = type;
    this->setColors();
}

void RGLCell::toggleNumbers(bool on) {
    if (on) {
        stringstream text;
        text << i << "," << j;
        this->setText(QString::fromStdString(text.str()));
    } else this->setText("");
}

void RGLCell::setColors() {
    //0 blank, 1 obstacle, 2 box
    if (type == 0) setStyleSheet("background: rgb(220,220,220); color : gray; ");
	else if (type == 1) setStyleSheet("background: rgb(70,70,70); color : darkGray; ");
	else setStyleSheet("background: rgb(210,180,140); color : black; ");
}
