#include <QApplication>
#include <QSplashScreen>
#include <stdlib.h>
#include "RGLMapEditor.h"

int main(int argc, char **argv) {
	QApplication app(argc, argv);
    RGLMapEditor form;
	form.show();
	return app.exec();
}

