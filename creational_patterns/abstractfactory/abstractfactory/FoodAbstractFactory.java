package creational_patterns.abstractfactory.abstractfactory;

import creational_patterns.abstractfactory.countries.CountryCode;
import creational_patterns.abstractfactory.factory.AmericanFoodFactory;
import creational_patterns.abstractfactory.factory.FoodFactory;
import creational_patterns.abstractfactory.factory.JapaneseFoodFactory;
import creational_patterns.abstractfactory.factory.UkrainianFoodFactory;

public class FoodAbstractFactory {
    public static FoodFactory createFoodFactory(CountryCode code) {
        if (code.equals(CountryCode.JAPAN)) {
            return new JapaneseFoodFactory();
        }

        if (code.equals(CountryCode.AMERICA)) {
            return new AmericanFoodFactory();
        }

        if (code.equals(CountryCode.UKRAINE)) {
            return new UkrainianFoodFactory();
        }

        throw new IllegalArgumentException("No country with code " + code);
    }
}
