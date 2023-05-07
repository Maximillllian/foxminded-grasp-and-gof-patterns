package com.company.texture;

import com.company.Texture;

public class CavalryTexture implements Texture {
    private byte[] bytes;

    public CavalryTexture() {
        this.bytes = new byte[40 * 1024];
    }

    @Override
    public void draw() {
        System.out.println("cavalry draw");
    }
}
