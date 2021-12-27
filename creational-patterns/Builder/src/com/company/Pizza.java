package com.company;

public class Pizza {
    private int mashroomsAmountGrams;
    private int seafoodAmountGrams;
    private int cheezeAmountGrams;
    private int pineAppleAmountGrams;
    private int beaconAmountGrams;

    public Pizza(int mashroomsAmountGrams, int seafoodAmountGrams, int cheezeAmountGrams, int pineAppleAmountGrams, int beaconAmountGrams) {
        this.mashroomsAmountGrams = mashroomsAmountGrams;
        this.seafoodAmountGrams = seafoodAmountGrams;
        this.cheezeAmountGrams = cheezeAmountGrams;
        this.pineAppleAmountGrams = pineAppleAmountGrams;
        this.beaconAmountGrams = beaconAmountGrams;
    }

    public int getMashroomsAmountGrams() {
        return mashroomsAmountGrams;
    }

    public void setMashroomsAmountGrams(int mashroomsAmountGrams) {
        this.mashroomsAmountGrams = mashroomsAmountGrams;
    }

    public int getSeafoodAmountGrams() {
        return seafoodAmountGrams;
    }

    public void setSeafoodAmountGrams(int seafoodAmountGrams) {
        this.seafoodAmountGrams = seafoodAmountGrams;
    }

    public int getCheezeAmountGrams() {
        return cheezeAmountGrams;
    }

    public void setCheezeAmountGrams(int cheezeAmountGrams) {
        this.cheezeAmountGrams = cheezeAmountGrams;
    }

    public int getPineAppleAmountGrams() {
        return pineAppleAmountGrams;
    }

    public void setPineAppleAmountGrams(int pineAppleAmountGrams) {
        this.pineAppleAmountGrams = pineAppleAmountGrams;
    }

    public int getBeaconAmountGrams() {
        return beaconAmountGrams;
    }

    public void setBeaconAmountGrams(int beaconAmountGrams) {
        this.beaconAmountGrams = beaconAmountGrams;
    }

    public static IPizzaBuilder builder() {
        return new PizzaBuilder();
    }
}
