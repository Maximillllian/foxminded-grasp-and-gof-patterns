package com.company.factories;

import com.company.meals.Drink;
import com.company.meals.FirstCourse;
import com.company.meals.Salad;
import com.company.meals.SecondCourse;

public interface MealAbstractFactory {

    Salad createSalad();

    Drink createDrink();

    FirstCourse createFirstCourse();

    SecondCourse createSecondCourse();
}
