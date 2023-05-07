package structural_patterns.flyweight.src.com.company.sound;

import structural_patterns.flyweight.src.com.company.Sound;

public class CavalrySound implements Sound {
    private byte[] sound;

    public CavalrySound() {
        this.sound = new byte[100 * 1024];
    }

    @Override
    public void makeSound() {
        System.out.println("cavalry is coming");
    }
}
