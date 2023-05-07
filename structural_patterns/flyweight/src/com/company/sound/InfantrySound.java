package com.company.sound;

import com.company.Sound;

public class InfantrySound implements Sound {
    private byte[] sound;

    public InfantrySound() {
        this.sound = new byte[150 * 1024];
    }

    @Override
    public void makeSound() {
        System.out.println("infantry is coming");
    }
}
