package com.company;

public class Main {

    public static void main(String[] args) {
        var school = new School();
        var airport = new Airport();
        var roadService = new RoadService();

        var alarmer = new StormAlarmer(10);
        alarmer.subscribe(school, WindLevel.VeryStrong);
        alarmer.subscribe(airport, WindLevel.HeavyStorm);

        for (int velocity = 11; velocity < 30; velocity++) {
            alarmer.setWindVelocity(velocity);
        }

        alarmer.subscribe(roadService, WindLevel.BrutalStorm);
    }
}
