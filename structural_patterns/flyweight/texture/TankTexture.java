package structural_patterns.flyweight.texture;

import structural_patterns.flyweight.Texture;

public class TankTexture implements Texture {
    private byte[] bytes;

    public TankTexture() {
        this.bytes = new byte[1024 * 8];
    }

    @Override
    public void draw() {
        System.out.println("Tank texture drawing...");
    }
}
