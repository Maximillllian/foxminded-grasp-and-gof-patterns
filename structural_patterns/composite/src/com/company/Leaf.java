package com.company;

public class Leaf implements Component {

    private int value;

    Leaf(int value) {
        this.value = value;
    }

    @Override
    public void add(int value) {
        throw new IllegalStateException();
    }

    @Override
    public void increment() {
        value++;
    }
}
