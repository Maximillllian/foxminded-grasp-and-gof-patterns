package structural_patterns.bridge.dish;

import structural_patterns.bridge.cuisine.Cuisine;

public class FirstCourse extends DishAbstract {
    public FirstCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.getCuisine().cookFirstCourse();
    }
}
