package creational_patterns.factorymethod.src.dish;

import creational_patterns.factorymethod.src.food.*;

import java.util.List;

public class DishFactory {
    public static Dish create(String dishName) {
        if (dishName.equalsIgnoreCase("omelette")) {
            var eggs = List.of(new Egg(), new Egg());
            return new Omelette(eggs, new Butter(), new Oil());
        }

        if (dishName.equalsIgnoreCase("casserole")) {
            var tomatoes = List.of(
                new Tomato(), new Tomato(), new Tomato(), new Tomato()
            );
            return new Casserole(tomatoes, new Meat());
        }

        throw new IllegalArgumentException("No dish with name " + dishName);
    }
}
