package structural_patterns.decorator;

import structural_patterns.decorator.pizza.decorator.BeaconDecorator;
import structural_patterns.decorator.pizza.decorator.CheeseDecorator;
import structural_patterns.decorator.pizza.PizzaImpl;
import structural_patterns.decorator.pizza.decorator.MushroomDecorator;

public class Main {
    public static void main(String[] args) {
        var pizza = new BeaconDecorator(new MushroomDecorator(new CheeseDecorator(new PizzaImpl())));
        pizza.cook();
        System.out.println(pizza.getComponents());
    }
}
