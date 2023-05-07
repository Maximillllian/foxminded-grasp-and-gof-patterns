package creational_patterns.abstractfactory.src.com.company.factories;

import creational_patterns.abstractfactory.src.com.company.meals.Drink;
import creational_patterns.abstractfactory.src.com.company.meals.FirstCourse;
import creational_patterns.abstractfactory.src.com.company.meals.Salad;
import creational_patterns.abstractfactory.src.com.company.meals.SecondCourse;
import creational_patterns.abstractfactory.src.com.company.meals.japanise.JapaneseDrink;
import creational_patterns.abstractfactory.src.com.company.meals.japanise.JapaneseFirstCourse;
import creational_patterns.abstractfactory.src.com.company.meals.japanise.JapaneseSalad;
import creational_patterns.abstractfactory.src.com.company.meals.japanise.JapaneseSecondCourse;

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
