package structural_patterns.bridge.dish;

import structural_patterns.bridge.cuisine.Cuisine;

public class SecondCourse extends DishAbstract {
    public SecondCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.getCuisine().cookSecondCourse();
    }
}
