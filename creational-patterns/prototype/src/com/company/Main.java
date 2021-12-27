package com.company;

public class Main {

    public static void main(String[] args) {
        //Создайте класс автомобиль, имеющий три разных предустановленных варианта (легковой, грузовой и минивен), позволяющий изменение только полей цвет и номер
        //
        //Внимание - не три класса,а  один, просто с тремя предустановленными вариантами.
        //
        //Метод клон не должен вызываться из клиентского кода. Наоборот - должны быть предоставлены методы, позволяющие создавать разные типы 

        var passengerCar = Car.createPassengerCar("red", "re421f");
        passengerCar.setColor("black");

        var truck = Car.createTruck("white", "tr432h");
        truck.setNumber("tr433h");

        var minivan = Car.createMinivan("blue", "tg453j");
        minivan.putPassengers(5);
    }
}
