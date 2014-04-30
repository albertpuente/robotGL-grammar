#include <QtCore>
#include <QApplication>
#include <QPixmap>
#include <QSplashScreen>
#include <QWidget>
#include <QMainWindow>
#include <QTimer>
#include <QThread>     
#include <stdlib.h>
          
class I : public QThread {
    public:
        static void sleep(unsigned long secs) {
                QThread::sleep(secs);
        }
};
    
int main(int argc, char *argv[]) {     
    QApplication app(argc, argv);
    QPixmap pixmap("splash.png"); 
    QSplashScreen splash(pixmap);
    splash.show();
    splash.showMessage(QObject::tr("Compiling..."), Qt::AlignLeft | Qt::AlignTop, Qt::black);  
    splash.raise();
    qApp->processEvents();    
    I::sleep(5);    
}

