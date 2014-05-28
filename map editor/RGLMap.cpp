#include "RGLMap.h"
#include <iostream>
#include <fstream>
#include <QFileDialog>
#include <QMessageBox>

using namespace std;

#define for_each_cell for (int i = 0; i < mapsize; ++i) for (int j = 0; j < mapsize; ++j) 

RGLMap::RGLMap(QWidget *parent)
    : QFrame(parent) {
        this->parent = parent;
        numbersOn = false;
        mapsize = 11;
        
        createCells();
        recalcMinimumSize(parent);
}

void RGLMap::setMapSize (int size) {
    deleteCells(size);
    updateCells(size);
    
    mapsize = size;
    recalcMinimumSize(parent);
}

void RGLMap::recalcMinimumSize(QWidget* p) {
    int minsize = max(mapsize * 40, 400);
    this->setMinimumSize(minsize, minsize);
    p->setMinimumSize(minsize + 22, minsize + 56);
    p->resize(minsize + 22, minsize + 56);
    resizeCells();
}

void RGLMap::deleteCells(int newsize) {
    for_each_cell {
        if (i >= newsize or j >= newsize)
            //cutting off cells. we hide them
            cells[i][j]->hide();
    }
}

void RGLMap::updateCells(int newsize) {
    vector<vector<RGLCell*> > newcells (newsize, vector<RGLCell*> (newsize));
    for (int i = 0; i < newsize; ++i)
        for (int j = 0; j < newsize; ++j) 
            if (i >= mapsize or j >= mapsize) {
                newcells[i][j] = new RGLCell(this, j, i);
                newcells[i][j]->toggleNumbers(numbersOn);
                newcells[i][j]->show();
            }
            else newcells[i][j] = cells[i][j];
    cells = newcells;
}

void RGLMap::createCells() {
    cells = vector<vector<RGLCell*> > (mapsize, vector<RGLCell*> (mapsize));
    for_each_cell { cells[i][j] = new RGLCell(this, j, i); }
}

void RGLMap::resizeEvent (QResizeEvent * event) {
    resizeCells();
}

void RGLMap::resizeCells () {
    int wsize = this->width() / mapsize;
    int hsize = this->height() / mapsize;
    for_each_cell {
        cells[i][j]->resize(wsize, hsize);
        cells[i][j]->move(wsize*j, hsize*i);
    }
}

void RGLMap::resetCells() {
    for_each_cell {
        cells[i][j]->setType(0);
    }
}

void RGLMap::toggleNumbers() {
    numbersOn = not numbersOn;
    if (numbersOn) for_each_cell { cells[i][j]->toggleNumbers(true); }
    else for_each_cell { cells[i][j]->toggleNumbers(false); }
}

void RGLMap::printTemplate() {
    string filename = (QFileDialog::getSaveFileName(this, tr("Open File"),
                                                 "",
                                                 tr("RGL program files (*.rgl)"))).toStdString();
    

    ofstream file;
    file.open(filename.c_str());
    if ( (file.rdstate() & ofstream::failbit ) == 0 ) {
        file << "DEFINITIONS" << endl << endl;
        file << "    action buildMap :" << endl;        
        for_each_cell {
            int type = cells[i][j]->getType();
            switch(type) {
                case 1: file << "        obstacle " << j << ", " << i << endl; break;
                case 2: file << "        box "      << j << ", " << i << endl; break;
                default: break;
            }
        }
        file << "    endaction" << endl << endl;      
        file << "ENDDEFINITIONS" << endl << endl;
        file << "BEGIN" << endl << endl;
        file << "    initMap " << mapsize << endl;
        file << "    initRobot x, y, angle //replace x, y, angle with the desired robot position" << endl;
        file << "    buildMap ()" << endl;
        file << endl << "END" << endl;
        
        file.close();        
        QMessageBox fileSaved;
        fileSaved.addButton(tr("Ok"), QMessageBox::ActionRole);
        fileSaved.setText("File saved correctly");
        fileSaved.exec();
    }
}                                    
    
