package com.company;

import com.company.entities.Injury;

public class Main {

    public static void main(String[] args) {
        EmergencyCallHandler emergencyCallHandler = new Police();
        emergencyCallHandler.setNextHandler(new Ambulance());
        emergencyCallHandler.handle(new Injury());
    }
}
