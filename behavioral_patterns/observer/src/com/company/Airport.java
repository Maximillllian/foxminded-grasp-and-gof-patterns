package com.company;

public class Airport implements Observer {

    @Override
    public void notify(String event) {
        System.out.println("Airport is notified about " + event);
    }
}
