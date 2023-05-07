package creational_patterns.abstractfactory.src.com.company.factories;

import creational_patterns.abstractfactory.src.com.company.meals.Drink;
import creational_patterns.abstractfactory.src.com.company.meals.FirstCourse;
import creational_patterns.abstractfactory.src.com.company.meals.Salad;
import creational_patterns.abstractfactory.src.com.company.meals.SecondCourse;
import creational_patterns.abstractfactory.src.com.company.meals.ukranian.UkranianDrink;
import creational_patterns.abstractfactory.src.com.company.meals.ukranian.UkranianFirstCourse;
import creational_patterns.abstractfactory.src.com.company.meals.ukranian.UkranianSalad;
import creational_patterns.abstractfactory.src.com.company.meals.ukranian.UkranianSecondCourse;

public class UkranianMealAbstractFactory implements MealAbstractFactory {
    @Override
    public Salad createSalad() {
        return new UkranianSalad();
    }

    @Override
    public Drink createDrink() {
        return new UkranianDrink();
    }

    @Override
    public FirstCourse createFirstCourse() {
        return new UkranianFirstCourse();
    }

    @Override
    public SecondCourse createSecondCourse() {
        return new UkranianSecondCourse();
    }
}
