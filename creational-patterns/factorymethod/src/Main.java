

public class Main {
    public static void main(String[] args) {
        var dish = DishFactory.Create("ommelete");
        dish.eat();
    }
}
