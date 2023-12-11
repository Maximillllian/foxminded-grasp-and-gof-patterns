package structural_patterns.flyweight.unit;

import structural_patterns.flyweight.Coordinates;
import structural_patterns.flyweight.Unit;
import structural_patterns.flyweight.UnitType;

public class CavalryUnit extends Unit {
    public CavalryUnit(Coordinates coordinates) {
        super(coordinates, 4, UnitType.CAVALRY);
    }
}
