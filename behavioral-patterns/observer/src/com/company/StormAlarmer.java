package com.company;

import java.util.LinkedList;
import java.util.List;

public class StormAlarmer implements Publisher {

    private int windVelocity;
    private List<Observer> observers;

    private final static int MIN_STORM_VELOCITY = 20;

    public StormAlarmer(int windVelocity) {
        this.windVelocity = windVelocity;
        this.observers = new LinkedList<>();
    }

    public void setWindVelocity(int windVelocity) {
        if (windVelocity >= MIN_STORM_VELOCITY && this.windVelocity < MIN_STORM_VELOCITY) {
            for (var observer : observers) {
                observer.notify("storm started");
            }
        } else if (windVelocity < MIN_STORM_VELOCITY && this.windVelocity >= MIN_STORM_VELOCITY) {
            for (var observer : observers) {
                observer.notify("storm finished");
            }
        }
        this.windVelocity = windVelocity;

    }

    @Override
    public void subscribe(Observer observer) {
        if (observers.contains(observer)) {
            throw new IllegalArgumentException("this observer is already subscribed");
        }

        observers.add(observer);
        if (this.windVelocity >= MIN_STORM_VELOCITY) {
            observer.notify("storm is now");
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        if (!observers.remove(observer)) {
            throw new IllegalArgumentException("no such observer");
        }
    }
}
