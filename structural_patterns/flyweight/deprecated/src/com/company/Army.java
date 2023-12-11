package structural_patterns.flyweight.deprecated.src.com.company;

import structural_patterns.flyweight.deprecated.src.com.company.units.InfantryUnit;
import structural_patterns.flyweight.deprecated.src.com.company.units.TankUnit;
import structural_patterns.flyweight.deprecated.src.com.company.units.СavalryUnit;

import java.util.List;

public class Army {
    private List<MilitaryUnit> units;

    public Army() {
        units = List.of();
    }

    public void add(int x, int y, UnitType unitType) {
        MilitaryUnitType militaryUnitType = MilitaryUnitFactory.getMilitatyUnitType(unitType);
        if (unitType == UnitType.Infantry) {
            var militaryUnit = new InfantryUnit(x, y, militaryUnitType);
            units.add(militaryUnit);
        } else if (unitType == UnitType.Cavalry) {
            var militartUnit = new СavalryUnit(x, y, militaryUnitType);
            units.add(militartUnit);
        } else if (unitType == UnitType.Tank) {
            var militartUnit = new TankUnit(x, y, militaryUnitType);
            units.add(militartUnit);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void moveDown() {
        this.units.forEach(MilitaryUnit::moveDown);
    }

    public void moveUp() {
        this.units.forEach(MilitaryUnit::moveUp);
    }

    public void moveRight() {
        this.units.forEach(MilitaryUnit::moveRight);
    }

    public void moveLeft() {
        this.units.forEach(MilitaryUnit::moveLeft);
    }
}
