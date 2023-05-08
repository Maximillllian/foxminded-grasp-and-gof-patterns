package creational_patterns.prototype.car;

import java.util.HashMap;

public class CarPrototype {
    private HashMap<CarType, Car> carsMap = new HashMap<>();

    public CarPrototype() {
        putCarInMap(CarType.PASSENGER);
        putCarInMap(CarType.TRUCK);
        putCarInMap(CarType.MINIVAN);
    }

    public Car getPassengerCar() {
        return cloneCar(CarType.PASSENGER);
    };

    public Car getTruck() {
        return cloneCar(CarType.TRUCK);
    };

    public Car getMinivan() {
        return cloneCar(CarType.MINIVAN);
    };

    public Car cloneCar(CarType type) {
        return (Car) carsMap.get(type).clone();
    }

    private void putCarInMap(CarType type) {
        var passengerCar = new Car(type);
        carsMap.put(type, passengerCar);
    }
}
