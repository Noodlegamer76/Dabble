#version 330 core

layout (location = 0) in vec3 aPosition;
out vec3 vWorldPos;

uniform mat4 ModelViewMat;
uniform vec3 uBlockPosition;

void main() {
    // Calculate world position relative to the block
    vWorldPos = aPosition + uBlockPosition;

    // Transform vertex position
    gl_Position = ModelViewMat * vec4(aPosition, 1.0);
}