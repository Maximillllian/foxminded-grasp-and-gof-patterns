package com.company.factories;

import com.company.meals.Drink;
import com.company.meals.FirstCourse;
import com.company.meals.Salad;
import com.company.meals.SecondCourse;
import com.company.meals.japanise.JapaneseDrink;
import com.company.meals.japanise.JapaneseFirstCourse;
import com.company.meals.japanise.JapaneseSalad;
import com.company.meals.japanise.JapaneseSecondCourse;

public class JapaneseMealAbstractFactory implements MealAbstractFactory {
    @Override
    public Salad createSalad() {
        return new JapaneseSalad();
    }

    @Override
    public Drink createDrink() {
        return new JapaneseDrink();
    }

    @Override
    public FirstCourse createFirstCourse() {
        return new JapaneseFirstCourse();
    }

    @Override
    public SecondCourse createSecondCourse() {
        return new JapaneseSecondCourse();
    }
}
