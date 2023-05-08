package creational_patterns.abstractfactory;

import creational_patterns.abstractfactory.abstractfactory.FoodAbstractFactory;
import creational_patterns.abstractfactory.countries.CountryCode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var americanFoodFactory = FoodAbstractFactory.createFoodFactory(CountryCode.AMERICA);
        var japaneseFoodFactory = FoodAbstractFactory.createFoodFactory(CountryCode.JAPAN);
        var ukrainianFoodFactory = FoodAbstractFactory.createFoodFactory(CountryCode.UKRAINE);
        var factories = List.of(americanFoodFactory, japaneseFoodFactory, ukrainianFoodFactory);

        factories.forEach(it -> {
            System.out.println(it.toString());
            System.out.println("drink " + it.createDrink());
            System.out.println("salad " + it.createSalad());
            System.out.println("firstCourse " + it.createFirstCourse());
            System.out.println("secondCourse " + it.createSecondCourse());
            System.out.println("----------------------------------------");
        });
    }
}
