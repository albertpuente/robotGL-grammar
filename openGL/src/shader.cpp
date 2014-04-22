// Una classe simple per gestionar shaders GLSL.

#include "shader.h"

string shader::read(const string& name) {
    string s;    
    ifstream file(("res/"+name).c_str());   
    string line;
    if (file.is_open()) {
        while (getline(file, line)) {
            s.append(line + "\n");
        }
    }
    else {
        cout << "No es pot obrir el shader " << name << endl;
        exit(0);
    }
    file.close();  
    return s;
}

shader::shader(){
    
}

shader::shader(const string& vertName, const string& fragName) {   
    text = 0;
    GLenum err = glewInit();
    string vertexSource = read(vertName);
    string fragSource = read(fragName);
    GLuint vertexShader = glCreateShader(GL_VERTEX_SHADER);
    const GLchar *source = (const GLchar *)vertexSource.c_str();
    glShaderSource(vertexShader, 1, &source, 0);
    glCompileShader(vertexShader);
    GLint isCompiled = 0;
    glGetShaderiv(vertexShader, GL_COMPILE_STATUS, &isCompiled);
    if(isCompiled == GL_FALSE) { // Error de compilacio
        GLint maxLength = 0;
        glGetShaderiv(vertexShader, GL_INFO_LOG_LENGTH, &maxLength);
        vector<GLchar> infoLog(maxLength);
        glGetShaderInfoLog(vertexShader, maxLength, &maxLength, &infoLog[0]);
        glDeleteShader(vertexShader);        
        for (int i = 0; i < infoLog.size(); ++i) cout << infoLog[i];
        cout << "Error de compilacio en vertex shader" << endl;
        exit(0);
    }    

    GLuint fragmentShader = glCreateShader(GL_FRAGMENT_SHADER);
    source = (const GLchar *)fragSource.c_str();
    glShaderSource(fragmentShader, 1, &source, 0);
    glCompileShader(fragmentShader);    
    glGetShaderiv(fragmentShader, GL_COMPILE_STATUS, &isCompiled);
    if(isCompiled == GL_FALSE) { // Error de compilacio
        GLint maxLength = 0;
        glGetShaderiv(fragmentShader, GL_INFO_LOG_LENGTH, &maxLength);
        vector<GLchar> infoLog(maxLength);
        glGetShaderInfoLog(fragmentShader, maxLength, &maxLength, &infoLog[0]);
        glDeleteShader(vertexShader);
        glDeleteShader(fragmentShader);
        for (int i = 0; i < infoLog.size(); ++i) cout << infoLog[i];
        cout << "Error de compilacio en fragment shader" << endl;
        exit(0);
    }
    
    program = glCreateProgram();

    glAttachShader(program, vertexShader);
    glAttachShader(program, fragmentShader);
    
    glLinkProgram(program);

    GLint isLinked = 0;
    glGetProgramiv(program, GL_LINK_STATUS, (int *)&isLinked);
    if(isLinked == GL_FALSE) { // Error de linkatge
        GLint maxLength = 0;
        glGetProgramiv(program, GL_INFO_LOG_LENGTH, &maxLength);
        vector<GLchar> infoLog(maxLength);
        glGetProgramInfoLog(program, maxLength, &maxLength, &infoLog[0]);
        glDeleteProgram(program);
        glDeleteShader(vertexShader);
        glDeleteShader(fragmentShader);
        for (int i = 0; i < infoLog.size(); ++i) cout << infoLog[i];
        cout << "Error de linkatge" << endl;
        exit(0);
    }
    
    glDetachShader(program, vertexShader);
    glDetachShader(program, fragmentShader);
}

void shader::loadImg(const string& fullName) {
    text = SOIL_load_OGL_texture(("res/"+fullName).c_str(),
        SOIL_LOAD_AUTO,
        SOIL_CREATE_NEW_ID,
        SOIL_FLAG_INVERT_Y | SOIL_FLAG_POWER_OF_TWO | SOIL_FLAG_MIPMAPS );
    glUseProgram(program);
    int loc = glGetUniformLocation(program, "sampler");
    glUniform1i(loc, 0);
    glActiveTexture(GL_TEXTURE0); 
    glBindTexture(GL_TEXTURE_2D, text);
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
    glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR_MIPMAP_LINEAR);
}



void shader::on() {
    glEnable(GL_TEXTURE_2D);
    glActiveTexture(GL_TEXTURE0); 
    glBindTexture(GL_TEXTURE_2D, text);
    glUseProgram(program);
}

void shader::off() {
    glUseProgram(0);
    glDisable(GL_TEXTURE_2D);
}

void shader::passUniform(const string& name, double value) {
    GLint myUniformLocation = glGetUniformLocation(program, name.c_str()); 
    glUniform1f(myUniformLocation, value);
}

