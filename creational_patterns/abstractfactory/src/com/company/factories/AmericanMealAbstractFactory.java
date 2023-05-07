package creational_patterns.abstractfactory.src.com.company.factories;

import creational_patterns.abstractfactory.src.com.company.meals.Drink;
import creational_patterns.abstractfactory.src.com.company.meals.FirstCourse;
import creational_patterns.abstractfactory.src.com.company.meals.Salad;
import creational_patterns.abstractfactory.src.com.company.meals.SecondCourse;
import creational_patterns.abstractfactory.src.com.company.meals.american.AmericanDrink;
import creational_patterns.abstractfactory.src.com.company.meals.american.AmericanFirstCourse;
import creational_patterns.abstractfactory.src.com.company.meals.american.AmericanSalad;
import creational_patterns.abstractfactory.src.com.company.meals.american.AmericanSecondCourse;

public class AmericanMealAbstractFactory implements MealAbstractFactory {

    @Override
    public Salad createSalad() {
        return new AmericanSalad();
    }

    @Override
    public Drink createDrink() {
        return new AmericanDrink();
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
