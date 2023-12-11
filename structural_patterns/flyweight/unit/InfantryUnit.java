package structural_patterns.flyweight.unit;

import structural_patterns.flyweight.Coordinates;
import structural_patterns.flyweight.Unit;
import structural_patterns.flyweight.UnitType;

public class InfantryUnit extends Unit {
    public InfantryUnit(Coordinates coordinates) {
        super(coordinates, 1, UnitType.INFANTRY);
    }
}
