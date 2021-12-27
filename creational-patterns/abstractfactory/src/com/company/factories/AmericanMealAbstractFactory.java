package com.company.factories;

import com.company.meals.Drink;
import com.company.meals.FirstCourse;
import com.company.meals.Salad;
import com.company.meals.SecondCourse;
import com.company.meals.american.AmericanDrink;
import com.company.meals.american.AmericanFirstCourse;
import com.company.meals.american.AmericanSalad;
import com.company.meals.american.AmericanSecondCourse;

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
