// Una classe simple per gestionar shaders GLSL.

#include <GL/glew.h>
#include "SOIL.h"
#include <string>
#include <vector>
#include <fstream>
#include <iostream>
#include <stdlib.h> // exit
using namespace std;

class shader {
public:
    shader();
    shader(const string& vertName, const string& fragName);
    string read(const string& name);
    void loadImg(const string& fullName);
    void on();
    void off();
    void passUniform(const string& name, double value);
    
private:
    GLuint program;
    GLuint text;
};