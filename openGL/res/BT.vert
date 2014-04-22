varying vec3 pos;

void main() {
    gl_TexCoord[0] = gl_MultiTexCoord0;
    gl_Position    = gl_ModelViewProjectionMatrix * gl_Vertex;
	pos = gl_Vertex.xyz;
}
