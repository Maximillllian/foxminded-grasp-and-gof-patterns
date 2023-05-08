package creational_patterns.abstractfactory.factory;

import creational_patterns.abstractfactory.food.Drink;
import creational_patterns.abstractfactory.food.FirstCourse;
import creational_patterns.abstractfactory.food.Salad;
import creational_patterns.abstractfactory.food.SecondCourse;
import creational_patterns.abstractfactory.food.japan.JapaneseDrink;
import creational_patterns.abstractfactory.food.japan.JapaneseFirstCourse;
import creational_patterns.abstractfactory.food.japan.JapaneseSalad;
import creational_patterns.abstractfactory.food.japan.JapaneseSecondCourse;
import creational_patterns.abstractfactory.food.ukraine.UkrainianDrink;
import creational_patterns.abstractfactory.food.ukraine.UkrainianFirstCourse;
import creational_patterns.abstractfactory.food.ukraine.UkrainianSalad;
import creational_patterns.abstractfactory.food.ukraine.UkrainianSecondCourse;

public class JapaneseFoodFactory implements FoodFactory {
    @Override
    public Drink createDrink() {
        return new JapaneseDrink();
    }

    @Override
    public Salad createSalad() {
        return new JapaneseSalad();
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
