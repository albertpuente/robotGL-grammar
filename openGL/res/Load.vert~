uniform float nfrac, dist, ang;
varying vec3 pos;

const float pi = 3.1415926;

void main() {
    vec4 V = gl_Vertex;
    float inc = dist * nfrac;
    V.x += sin(ang) * inc;
    V.z += cos(ang) * inc;
    
    V.y += nfrac;
    gl_Position    = gl_ModelViewProjectionMatrix * V;
    gl_TexCoord[0] = gl_MultiTexCoord0;
    pos = gl_Vertex.xyz;
}