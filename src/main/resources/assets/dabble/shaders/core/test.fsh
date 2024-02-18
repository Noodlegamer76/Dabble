#version 330 core

in vec3 vWorldPos;
out vec4 FragColor;

uniform samplerCube uSkyboxTexture;
uniform vec3 uBlockPosition;
uniform float uVisibleRange; // Uniform for visible range

void main() {
    // Calculate distance from fragment to block
    float distanceToBlock = distance(vWorldPos, uBlockPosition);

    // Check if fragment is within visible range of the block
    if (distanceToBlock <= uVisibleRange) {
        // Render the skybox texture
        FragColor = texture(uSkyboxTexture, normalize(vWorldPos - uBlockPosition));
    } else {
        // Render the fragment as transparent
        FragColor = vec4(0.0); // Complete transparency
    }
}