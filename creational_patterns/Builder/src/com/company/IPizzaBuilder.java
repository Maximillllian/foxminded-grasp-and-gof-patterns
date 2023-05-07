package com.company;

public interface IPizzaBuilder {
    void reset();
    void setCheezeAmount(int grams);
    void setBeaconAmount(int grams);
    void setPineappleAmount(int grams);
    void setMushroomsAmount(int grams);
    void setSeafoodAmount(int grams);
    Pizza build();
}
