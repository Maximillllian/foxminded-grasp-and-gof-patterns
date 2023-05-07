package structural_patterns.flyweight.src.com.company;

public class MilitaryUnitType {
    private Texture texture;
    private Sound sound;

    public Texture getTexture() {
        return texture;
    }

    public Sound getSound() {
        return sound;
    }

    public MilitaryUnitType(Texture texture, Sound sound) {
        this.texture = texture;
        this.sound = sound;
    }

    public void draw() {
        this.texture.draw();
    }

    public void makeSound() {
        this.sound.makeSound();
    }
}
