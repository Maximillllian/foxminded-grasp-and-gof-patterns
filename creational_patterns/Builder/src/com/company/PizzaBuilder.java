package com.company;

public class PizzaBuilder implements IPizzaBuilder {

    private Pizza pizza;
    private int mashroomsAmountGrams;
    private int seafoodAmountGrams;
    private int cheezeAmountGrams;
    private int pineAppleAmountGrams;
    private int beaconAmountGrams;

    @Override
    public void reset() {
        this.pizza = null;

        this.mashroomsAmountGrams = 0;
        this.seafoodAmountGrams = 0;
        this.beaconAmountGrams = 0;
        this.cheezeAmountGrams = 0;
        this.pineAppleAmountGrams = 0;
    }

    @Override
    public void setCheezeAmount(int grams) {
        this.cheezeAmountGrams = grams;
    }

    @Override
    public void setBeaconAmount(int grams) {
        this.beaconAmountGrams = grams;
    }

    @Override
    public void setPineappleAmount(int grams) {
        this.pineAppleAmountGrams = grams;
    }

    @Override
    public void setMushroomsAmount(int grams) {
        this.mashroomsAmountGrams = grams;
    }

    @Override
    public void setSeafoodAmount(int grams) {
        this.seafoodAmountGrams = grams;
    }

    @Override
    public Pizza build() {
        return new Pizza(mashroomsAmountGrams, seafoodAmountGrams, cheezeAmountGrams, pineAppleAmountGrams, beaconAmountGrams);
    }
}
