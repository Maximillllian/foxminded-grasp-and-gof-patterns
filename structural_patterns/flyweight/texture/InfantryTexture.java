package structural_patterns.flyweight.texture;

import structural_patterns.flyweight.Texture;

public class InfantryTexture implements Texture {
    private byte[] bytes;

    public InfantryTexture() {
        this.bytes = new byte[1024 * 7];
    }

    @Override
    public void draw() {
        System.out.println("Infantry texture drawing...");
    }
}
