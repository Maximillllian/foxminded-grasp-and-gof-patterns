package structural_patterns.bridge;

import structural_patterns.bridge.cuisine.AmericanCuisine;
import structural_patterns.bridge.cuisine.JapanCuisine;
import structural_patterns.bridge.cuisine.UkrainianCuisine;
import structural_patterns.bridge.dish.Dessert;
import structural_patterns.bridge.dish.FirstCourse;
import structural_patterns.bridge.dish.SecondCourse;
import structural_patterns.bridge.dish.ThirdCourse;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var cuisines = List.of(new JapanCuisine(), new AmericanCuisine(), new UkrainianCuisine());

        cuisines.forEach(it -> {
            new FirstCourse(it).cook();
            new SecondCourse(it).cook();
            new ThirdCourse(it).cook();
            new Dessert(it).cook();
        });
    }
}
