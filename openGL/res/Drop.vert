uniform float alpha;
varying vec3 pos;

void main() {
	vec4 V = gl_Vertex;
	V.y += 1.0/alpha - 1.0;
	gl_Position    = gl_ModelViewProjectionMatrix * V;
	gl_TexCoord[0] = gl_MultiTexCoord0;
	pos = gl_Vertex.xyz;
}
