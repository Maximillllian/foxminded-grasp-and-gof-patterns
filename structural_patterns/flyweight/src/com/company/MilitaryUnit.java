package com.company;

public abstract class MilitaryUnit {

    protected int x;
    protected int y;
    MilitaryUnitType militaryUnitType;

    public MilitaryUnit(int x, int y, MilitaryUnitType militaryUnitType) {
        this.x = x;
        this.y = y;
        this.militaryUnitType = militaryUnitType;
    }

    public abstract void moveRight();
    public abstract void moveLeft();
    public abstract void moveUp();
    public abstract void moveDown();
}
