package structural_patterns.flyweight.texture;

import structural_patterns.flyweight.Texture;

public class CavalryTexture implements Texture {
    private byte[] bytes;

    public CavalryTexture() {
        this.bytes = new byte[1024 * 6];
    }

    @Override
    public void draw() {
        System.out.println("Cavalry texture drawing...");
    }
}
