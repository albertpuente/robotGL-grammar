varying vec3 pos;
uniform float time;

void main() {
    gl_TexCoord[0] = gl_MultiTexCoord0;
    pos = gl_Vertex.xyz;
    pos.y += sin(time)/10.0;
    gl_Position    = gl_ModelViewProjectionMatrix * vec4(pos, 1.0);
}
