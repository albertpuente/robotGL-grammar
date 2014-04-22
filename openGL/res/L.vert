varying vec3 Normal;
varying vec3 V;

void main() {
    gl_Position    = gl_ModelViewProjectionMatrix * gl_Vertex;
    gl_FrontColor  = gl_Color;
    Normal = normalize(gl_NormalMatrix*gl_Normal);
    V = vec3(gl_ModelViewMatrix * gl_Vertex); 
}
