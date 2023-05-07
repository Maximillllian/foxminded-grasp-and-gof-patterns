package com.company;

public class Car {
    private String color;
    private String number;
    private int liftingCapacityKg;
    private int seatsAmount;

    private static final int PASSENGER_CAR_LIFTING_CAPACITY_KG = 300;
    private static final int PASSENGER_CAR_SEATS_AMOUNT = 4;

    private static final int TRUCK_LIFTING_CAPACITY_KG = 2000;
    private static final int TRUCK_CAR_SEATS_AMOUNT = 2;

    private static final int MINIVAN_LIFTING_CAPACITY_KG = 600;
    private static final int MINIVAN_SEATS_AMOUNT = 8;

    private Car() {}

    private Car(String color, String number, int liftingCapacityKg, int seatsAmount) {
        this.color = color;
        this.number = number;
        this.liftingCapacityKg = liftingCapacityKg;
        this.seatsAmount = seatsAmount;
    }

    public static Car createPassengerCar(String color, String number) {
        return new Car(color, number, PASSENGER_CAR_LIFTING_CAPACITY_KG, PASSENGER_CAR_SEATS_AMOUNT);
    }

    public static Car createTruck(String color, String number) {
        return new Car(color, number, TRUCK_LIFTING_CAPACITY_KG, TRUCK_CAR_SEATS_AMOUNT);
    }

    public static Car createMinivan(String color, String number) {
        return new Car(color, number, MINIVAN_LIFTING_CAPACITY_KG, MINIVAN_SEATS_AMOUNT);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void putPassengers(int amount) {
        if (this.seatsAmount - 1 < amount) {
            throw new IllegalArgumentException();
        }
    }

    public void putCargo(int weightKG) {
        if (this.liftingCapacityKg < weightKG) {
            throw new IllegalArgumentException();
        }
    }
}
