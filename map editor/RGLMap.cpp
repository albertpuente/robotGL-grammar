#include "RGLMap.h"
#include <iostream>
#include <fstream>
#include <QFileDialog>
#include <QMessageBox>

using namespace std;

#define for_each_cell for (int i = 0; i < mapsize.first; ++i) for (int j = 0; j < mapsize.second; ++j) 

RGLMap::RGLMap(QWidget *parent)
    : QFrame(parent) {
        this->parent = parent;
        numbersOn = false;
        mapsize.first = mapsize.second = 11;
        
        createCells();
        recalcMinimumSize(parent);
}

void RGLMap::setCols (int cols) {
    deleteCells(pair<int,int>(mapsize.first, cols));
    updateCells(pair<int,int>(mapsize.first, cols));
    
    mapsize.second = cols;
    recalcMinimumSize(parent);
}

void RGLMap::setRows (int rows) {
    deleteCells(pair<int,int>(rows, mapsize.second));
    updateCells(pair<int,int>(rows, mapsize.second));
    
    mapsize.first = rows;
    recalcMinimumSize(parent);
}

void RGLMap::recalcMinimumSize(QWidget* p) {
    int minwidth = max(mapsize.second * 40, 400);
    int minheight = max(mapsize.first * 40, 400);
    this->setMinimumSize(minwidth, minheight);
    p->setMinimumSize(minwidth + 22, minheight + 56);
    p->resize(minwidth + 22, minheight + 56);
    resizeCells();
}

void RGLMap::deleteCells(pair<int, int> newsize) {
    for_each_cell {
        if (i >= newsize.first or j >= newsize.second)
            //cutting off cells. we hide them
            cells[i][j]->hide();
    }
}

void RGLMap::updateCells(pair<int, int> newsize) {
    vector<vector<RGLCell*> > newcells (newsize.first, vector<RGLCell*> (newsize.second));
    for (int i = 0; i < newsize.first; ++i)
        for (int j = 0; j < newsize.second; ++j) 
            if (i >= mapsize.first or j >= mapsize.second) {
                newcells[i][j] = new RGLCell(this, j, i);
                newcells[i][j]->toggleNumbers(numbersOn);
                newcells[i][j]->show();
            }
            else newcells[i][j] = cells[i][j];
    cells = newcells;
}

void RGLMap::createCells() {
    cells = vector<vector<RGLCell*> > (mapsize.first, vector<RGLCell*> (mapsize.second));
    for_each_cell { cells[i][j] = new RGLCell(this, j, i); }
}

void RGLMap::resizeEvent (QResizeEvent * event) {
    resizeCells();
}

void RGLMap::resizeCells () {
    int wsize = this->width() / mapsize.second;
    int hsize = this->height() / mapsize.first;
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
                case 1: file << "        obstacle " << i << ", " << j << endl; break;
                case 2: file << "        box "      << i << ", " << j << endl; break;
                default: break;
            }
        }
        file << "    endaction" << endl << endl;      
        file << "ENDDEFINITIONS" << endl << endl;
        file << "BEGIN" << endl << endl;
        file << "    initMap " << mapsize.first << ", " << mapsize.second << endl;
        file << "    initRobot x, y    //replace x, y with the desired robot position" << endl;
        file << "    call buildMap" << endl;
        file << endl << "END" << endl;
        
        file.close();        
        QMessageBox fileSaved;
        fileSaved.addButton(tr("Ok"), QMessageBox::ActionRole);
        fileSaved.setText("File saved correctly");
        fileSaved.exec();
    }
}                                    
    
