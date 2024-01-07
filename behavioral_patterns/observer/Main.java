package behavioral_patterns.observer;

import behavioral_patterns.observer.observers.Airport;
import behavioral_patterns.observer.observers.HighwayService;
import behavioral_patterns.observer.observers.School;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var stormService = new StormService();

        var observers = List.of(new Airport(), new School(), new HighwayService());
        observers.forEach(it -> it.subscribe(stormService));

        addStorms(stormService);
        observers.forEach(it -> it.unsubscribe(stormService));

        stormService.addStorm(new Storm(StormLevel.RED));
        stormService.addStorm(new Storm(StormLevel.GREEN));
        stormService.addStorm(new Storm(StormLevel.YELLOW));
        addStorms(stormService);
    }

    private static void addStorms(StormService service) {
        addStorm(service, StormLevel.RED);
        addStorm(service, StormLevel.GREEN);
        addStorm(service, StormLevel.YELLOW);
    }

    private static void addStorm(StormService service, StormLevel level) {
        System.out.println("---------------------");
        System.out.println("Storm level " + level.toString());
        System.out.println("---------------------");
        service.addStorm(new Storm(level));
    }
}
