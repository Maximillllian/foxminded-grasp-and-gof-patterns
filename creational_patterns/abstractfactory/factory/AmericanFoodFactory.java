package creational_patterns.abstractfactory.factory;

import creational_patterns.abstractfactory.food.Drink;
import creational_patterns.abstractfactory.food.FirstCourse;
import creational_patterns.abstractfactory.food.Salad;
import creational_patterns.abstractfactory.food.SecondCourse;
import creational_patterns.abstractfactory.food.america.AmericanDrink;
import creational_patterns.abstractfactory.food.america.AmericanFirstCourse;
import creational_patterns.abstractfactory.food.america.AmericanSalad;
import creational_patterns.abstractfactory.food.america.AmericanSecondCourse;

public class AmericanFoodFactory implements FoodFactory {
    @Override
    public Drink createDrink() {
        return new AmericanDrink();
    }

    @Override
    public Salad createSalad() {
        return new AmericanSalad();
    }

    @Override
    public FirstCourse createFirstCourse() {
        return new AmericanFirstCourse();
    }

    @Override
    public SecondCourse createSecondCourse() {
        return new AmericanSecondCourse();
    }
}
