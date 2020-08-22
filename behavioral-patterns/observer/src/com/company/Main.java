package com.company;

public class Main {

    public static void main(String[] args) {
        var school = new School();
        var airport = new Airport();
        var roadService = new RoadService();

        var alarmer = new StormAlarmer(10);
        alarmer.subscribe(school);
        alarmer.subscribe(airport);

        for (int velocity = 11; velocity < 30; velocity++) {
            alarmer.setWindVelocity(velocity);
        }

        alarmer.subscribe(roadService);

        for (int velocity = 30; velocity > 10; velocity--) {
            alarmer.setWindVelocity(velocity);
        }
    }
}
