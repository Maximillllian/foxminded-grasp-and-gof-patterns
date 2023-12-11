package structural_patterns.flyweight.unit;

import structural_patterns.flyweight.Coordinates;
import structural_patterns.flyweight.Unit;
import structural_patterns.flyweight.UnitType;

public class TankUnit extends Unit {
    public TankUnit(Coordinates coordinates) {
        super(coordinates, 2, UnitType.TANK);
    }
}
