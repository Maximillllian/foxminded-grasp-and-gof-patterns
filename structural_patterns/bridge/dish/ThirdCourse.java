package structural_patterns.bridge.dish;

import structural_patterns.bridge.cuisine.Cuisine;
public class ThirdCourse extends DishAbstract {
    public ThirdCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.getCuisine().cookThirdCourse();
    }
}
