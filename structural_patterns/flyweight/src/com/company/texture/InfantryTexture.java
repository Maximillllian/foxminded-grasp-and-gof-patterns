package structural_patterns.flyweight.src.com.company.texture;

import structural_patterns.flyweight.src.com.company.Texture;

public class InfantryTexture implements Texture {

    private byte[] bytes;

    public InfantryTexture() {
        this.bytes = new byte[50 * 1024];
    }

    @Override
    public void draw() {
        System.out.println("infantry draw");
    }
}
