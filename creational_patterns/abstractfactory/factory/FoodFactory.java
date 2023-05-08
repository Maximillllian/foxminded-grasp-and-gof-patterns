package creational_patterns.abstractfactory.factory;

import creational_patterns.abstractfactory.food.Drink;
import creational_patterns.abstractfactory.food.FirstCourse;
import creational_patterns.abstractfactory.food.Salad;
import creational_patterns.abstractfactory.food.SecondCourse;

public interface FoodFactory {
    Drink createDrink();
    Salad createSalad();
    FirstCourse createFirstCourse();
    SecondCourse createSecondCourse();
}
