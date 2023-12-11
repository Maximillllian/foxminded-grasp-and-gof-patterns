package structural_patterns.flyweight.sound;

import structural_patterns.flyweight.Sound;

public class InfantrySound implements Sound {
    private byte[] bytes;

    public InfantrySound() {
        this.bytes = new byte[3 * 1024];
    }

    @Override
    public void makeSound() {
        System.out.println("Infantry, attack!");
    }
}
