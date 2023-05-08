package creational_patterns.prototype;

import creational_patterns.prototype.car.CarPrototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var carPrototype = new CarPrototype();
        var cars = List.of(carPrototype.getPassengerCar(), carPrototype.getMinivan(), carPrototype.getTruck());
        cars.forEach(it -> {
            it.setColor("red");
            System.out.println("car - " + it.getType().toString());
            System.out.println("carColor - " + it.getColor());
        });
        System.out.println("--------------------------");
        System.out.println("New Cars");
        var newCars = List.of(carPrototype.getPassengerCar(), carPrototype.getMinivan(), carPrototype.getTruck());
        newCars.forEach(it -> {
            System.out.println("car - " + it.getType().toString());
            System.out.println("carColor - " + it.getColor());
        });
        System.out.println("-------------------------------");
        System.out.println("Old Card");
        cars.forEach(it -> {
            System.out.println("car - " + it.getType().toString());
            System.out.println("carColor - " + it.getColor());
        });
    }
}
