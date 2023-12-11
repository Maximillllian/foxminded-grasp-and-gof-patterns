package structural_patterns.flyweight;

public interface Coordinates {
    int getX();
    int getY();

    void moveUp(int steps);
    void moveDown(int steps);
    void moveRight(int steps);
    void moveLeft(int steps);
}
