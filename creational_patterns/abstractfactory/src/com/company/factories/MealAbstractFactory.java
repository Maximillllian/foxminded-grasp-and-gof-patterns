package creational_patterns.abstractfactory.src.com.company.factories;

import creational_patterns.abstractfactory.src.com.company.meals.Drink;
import creational_patterns.abstractfactory.src.com.company.meals.FirstCourse;
import creational_patterns.abstractfactory.src.com.company.meals.Salad;
import creational_patterns.abstractfactory.src.com.company.meals.SecondCourse;

public interface MealAbstractFactory {

    Salad createSalad();

    Drink createDrink();

    FirstCourse createFirstCourse();

    SecondCourse createSecondCourse();
}
