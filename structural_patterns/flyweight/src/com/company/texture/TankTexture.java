package structural_patterns.flyweight.src.com.company.texture;

import structural_patterns.flyweight.src.com.company.Texture;

public class TankTexture implements Texture {
    private byte[] bytes;

    public TankTexture() {
        this.bytes = new byte[60 * 1024];
    }

    @Override
    public void draw() {
        System.out.println("tank draw");
    }
}
