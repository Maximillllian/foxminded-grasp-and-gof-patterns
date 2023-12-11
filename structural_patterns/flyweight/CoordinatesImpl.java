package structural_patterns.flyweight;

public class CoordinatesImpl implements Coordinates {
    private int x;
    private int y;

    public CoordinatesImpl(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void moveUp(int steps) {
        this.y += steps;
    }

    @Override
    public void moveDown(int steps) {
        this.y -= steps;
    }

    @Override
    public void moveRight(int steps) {
        this.x += steps;
    }

    @Override
    public void moveLeft(int steps) {
        this.x -= steps;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}
