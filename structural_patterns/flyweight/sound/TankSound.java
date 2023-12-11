package structural_patterns.flyweight.sound;

import structural_patterns.flyweight.Sound;

public class TankSound implements Sound {
    private byte[] bytes;

    public TankSound() {
        this.bytes = new byte[5 * 1024];
    }

    @Override
    public void makeSound() {
        System.out.println("pshhhhhh rrrr bah!");
    }
}
