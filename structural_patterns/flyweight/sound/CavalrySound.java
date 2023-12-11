package structural_patterns.flyweight.sound;

import structural_patterns.flyweight.Sound;

public class CavalrySound implements Sound {
    private byte[] bytes;

    public CavalrySound() {
        this.bytes = new byte[4 * 1024];
    }

    @Override
    public void makeSound() {
        System.out.println("IGOGO IGOGO!");
    }
}
