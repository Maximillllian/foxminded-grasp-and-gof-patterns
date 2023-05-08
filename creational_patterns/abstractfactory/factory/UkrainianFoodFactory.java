package creational_patterns.abstractfactory.factory;

import creational_patterns.abstractfactory.food.Drink;
import creational_patterns.abstractfactory.food.FirstCourse;
import creational_patterns.abstractfactory.food.Salad;
import creational_patterns.abstractfactory.food.SecondCourse;
import creational_patterns.abstractfactory.food.ukraine.UkrainianDrink;
import creational_patterns.abstractfactory.food.ukraine.UkrainianFirstCourse;
import creational_patterns.abstractfactory.food.ukraine.UkrainianSalad;
import creational_patterns.abstractfactory.food.ukraine.UkrainianSecondCourse;

public class UkrainianFoodFactory implements FoodFactory {
    @Override
    public Drink createDrink() {
        return new UkrainianDrink();
    }

    @Override
    public Salad createSalad() {
        return new UkrainianSalad();
    }

    @Override
    public FirstCourse createFirstCourse() {
        return new UkrainianFirstCourse();
    }

    @Override
    public SecondCourse createSecondCourse() {
        return new UkrainianSecondCourse();
    }
}
