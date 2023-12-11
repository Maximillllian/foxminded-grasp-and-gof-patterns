package structural_patterns.flyweight;

public class SharedUnit {
    private Texture texture;
    private Sound sound;

    public SharedUnit(Texture texture, Sound sound) {
        this.texture = texture;
        this.sound = sound;
    }

    public void draw() {
        texture.draw();
    };

    public void makeSound() {
        sound.makeSound();
    };
}
