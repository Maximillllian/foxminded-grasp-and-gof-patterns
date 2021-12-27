package com.company.factories;

import com.company.meals.Drink;
import com.company.meals.FirstCourse;
import com.company.meals.Salad;
import com.company.meals.SecondCourse;
import com.company.meals.ukranian.UkranianDrink;
import com.company.meals.ukranian.UkranianFirstCourse;
import com.company.meals.ukranian.UkranianSalad;
import com.company.meals.ukranian.UkranianSecondCourse;

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
