package creational_patterns.factorymethod.src;

import creational_patterns.factorymethod.src.dish.DishFactory;

public class Main {
    public static void main(String[] args) {
        var omelette = DishFactory.create("omelette");
        var casserole = DishFactory.create("casserole");

        System.out.println("omelette - " + omelette);
        System.out.println("casserole - " + casserole);
    }
}
