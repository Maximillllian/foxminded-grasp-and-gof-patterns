package com.company;

import com.company.factories.MealAbstractFactoryFactory;

public class Main {

    public static void main(String[] args) {
        var mealFactory = MealAbstractFactoryFactory.create(MealAbstractFactoryFactory.CountryCode.JP);
        var drink = mealFactory.createDrink();
        var salad = mealFactory.createSalad();
        var firstCourse = mealFactory.createFirstCourse();
        var secondCourse = mealFactory.createSecondCourse();
    }
}
