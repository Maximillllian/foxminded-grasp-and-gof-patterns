package structural_patterns.flyweight.src.com.company.sound;

import structural_patterns.flyweight.src.com.company.Sound;

public class TankSound implements Sound {
    private byte[] sound;

    public TankSound() {
        this.sound = new byte[200 * 1024];
    }

    @Override
    public void makeSound() {
        System.out.println("tank is coming");
    }
}
