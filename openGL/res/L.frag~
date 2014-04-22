varying vec3 Normal;
varying vec3 V; 

void main() {
    vec3 L = normalize(gl_LightSource[0].position.xyz - V);   
    vec3 E = normalize(-V);  
    float NL = max(dot(Normal,L), 0.0);
    vec3 R = normalize(2.0*NL*Normal-L);
    
    gl_FragColor = gl_Color-0.25;    

    gl_FragColor += gl_FrontLightProduct[0].diffuse * NL;     
    
    float s = gl_FrontMaterial.shininess;
    gl_FragColor += gl_FrontLightProduct[0].specular 
                * pow( max(dot(R,E), 0.0), s);
}
