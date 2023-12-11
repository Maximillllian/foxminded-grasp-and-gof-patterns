package structural_patterns.flyweight;

import structural_patterns.flyweight.shared.SharedUnitFactory;

public abstract class Unit {
    private int STEPS;
    private Coordinates coordinates;
    private UnitType type;
    private SharedUnit sharedUnit;

    public Unit(Coordinates coordinates, int steps, UnitType unitType) {
        this.coordinates = coordinates;
        this.STEPS = steps;
        this.type = unitType;
        this.sharedUnit = SharedUnitFactory.getSharedUnit(unitType);
    }

    public void draw() {
        System.out.println(coordinates);
        sharedUnit.draw();
    }
    public void makeSound() { sharedUnit.makeSound(); }
    public void moveUp() {
        coordinates.moveUp(STEPS);
    };
    public void moveDown() {
        coordinates.moveDown(STEPS);
    };
    public void moveRight() {
        coordinates.moveRight(STEPS);
    };
    public void moveLeft() {
        coordinates.moveLeft(STEPS);
    };
}
