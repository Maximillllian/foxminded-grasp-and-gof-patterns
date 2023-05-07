package com.company.texture;

import com.company.Texture;

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
