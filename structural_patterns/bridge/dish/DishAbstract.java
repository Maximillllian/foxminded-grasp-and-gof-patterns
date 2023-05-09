package structural_patterns.bridge.dish;

import structural_patterns.bridge.cuisine.Cuisine;

public abstract class DishAbstract implements Dish {
    private Cuisine cuisine;

    public DishAbstract(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    protected Cuisine getCuisine() {
        return cuisine;
    }
}
