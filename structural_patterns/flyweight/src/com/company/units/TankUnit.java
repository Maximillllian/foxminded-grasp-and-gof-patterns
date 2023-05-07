package com.company.units;

import com.company.MilitaryUnit;
import com.company.MilitaryUnitType;
import com.company.Sound;
import com.company.Texture;

public class TankUnit extends MilitaryUnit {
    private static final int STEP = 4;

    public TankUnit(int x, int y, MilitaryUnitType militaryUnitType) {
        super(x, y, militaryUnitType);
    }

    @Override
    public void moveRight() {
        x += STEP;
    }

    @Override
    public void moveLeft() {
        x -= STEP;
    }

    @Override
    public void moveUp() {
        y += STEP;
    }

    @Override
    public void moveDown() {
        y -= STEP;
    }
}
