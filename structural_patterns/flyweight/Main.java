package structural_patterns.flyweight;

import structural_patterns.flyweight.unit.CavalryUnit;
import structural_patterns.flyweight.unit.InfantryUnit;
import structural_patterns.flyweight.unit.TankUnit;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var units = List.of(
            new CavalryUnit(new CoordinatesImpl(0, 0)),
            new TankUnit(new CoordinatesImpl(1, 2)),
            new InfantryUnit(new CoordinatesImpl(5, 5))
        );

        units.forEach(it -> {
            it.moveDown();
            it.moveRight();
            it.makeSound();
            it.draw();
            System.out.println("------------------");
        });
    }
}
