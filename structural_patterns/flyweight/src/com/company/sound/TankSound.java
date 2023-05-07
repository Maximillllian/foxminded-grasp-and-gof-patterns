package com.company.sound;

import com.company.Sound;

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
