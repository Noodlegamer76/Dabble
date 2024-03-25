#version 300 es
in vec3 position; // input vertex position from mesh
in vec2 texcoord; // input vertex texture coordinate from mesh
in vec3 normal;   // input vertex normal from mesh

// uniform variables are exposed as node slots
uniform mat4 ProjMat; //description="camera projection matrix"
uniform mat4 ModelViewMat; // description="modelview transformation"

out vec2 tc; // output texture coordinate of vertex
out vec4 fn; // output fragment normal of vertex

void main(){
    tc = texcoord;
    fn = vec4(normal, 1.0);
    gl_Position = ProjMat * ModelViewMat * vec4(position, 1.0);
}