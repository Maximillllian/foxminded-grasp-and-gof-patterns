package structural_patterns.flyweight.src.com.company.units;

import structural_patterns.flyweight.src.com.company.MilitaryUnit;
import structural_patterns.flyweight.src.com.company.MilitaryUnitType;

public class СavalryUnit extends MilitaryUnit {
    private static final int STEP = 1;

    public СavalryUnit(int x, int y, MilitaryUnitType militaryUnitType) {
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
