uniform sampler2D sampler;
varying vec3 pos;

void main() {
    vec3 normal = normalize(vec3(cross(dFdy(pos.xyz), dFdx(pos.xyz))));

	float N = 1.0 - 0.5*abs(normal.x) - 0.25*abs(normal.z);
	
    gl_FragColor = texture2D(sampler, gl_TexCoord[0].st)*N;
}