package com.company.factories;

public class MealAbstractFactoryFactory {
    public static MealAbstractFactory create(CountryCode country) {
        return switch (country) {
            case JP -> new JapaneseMealAbstractFactory();
            case UA -> new UkranianMealAbstractFactory();
            case US -> new AmericanMealAbstractFactory();
        };
    }

    public enum CountryCode {
        JP("jp"),
        UA("ua"),
        US("us");

        CountryCode(String title) {
        }
    }
}
