package structural_patterns.bridge.dish;

import structural_patterns.bridge.cuisine.Cuisine;

public class Dessert extends DishAbstract {
    public Dessert(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.getCuisine().cookDessert();
    }
}
