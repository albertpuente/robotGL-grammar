#include <QApplication>
#include <QPixmap>
#include <QSplashScreen>
#include <QWidget>
#include <QMainWindow>

int main(int argc, char *argv[]) {
     QApplication app(argc, argv);
     QPixmap pixmap("obs.png");
     QSplashScreen splash(pixmap);
     splash.show();
     splash.showMessage("Wait...");
     qApp->processEvents();//This is used to accept a click on the screen so that user can cancel the screen
 
     QMainWindow window;
     window.setStyleSheet("* { background-color:rgb(199,147,88); padding: 7px}");
 
     window.show();
     splash.finish(&window);
     return app.exec();
 
}