package structural_patterns.flyweight.src.com.company;

public class Main {

    public static void main(String[] args) {
        Army army = new Army();
        army.add(0, 0, UnitType.Cavalry);
        army.moveDown();
    }
}
