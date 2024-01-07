package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StormService implements NotificationService {
    private List<StormObserver> observers = new ArrayList<>();
    private List<Storm> storms = new ArrayList<>();

    public StormService() {};

    public void addStorm(Storm storm) {
        storms.add(storm);
        notifyObserversAboutNewStorm(storm);
    }

    public void notifyObserversAboutNewStorm(Storm storm) {
        observers.forEach(it -> it.notify(storm));
    }

    @Override
    public void subscribe(StormObserver observer) {
        if (observers.contains(observer)) {
            return;
        }

        observers.add(observer);
    }

    @Override
    public void unsubscribe(StormObserver observer) {
        if (!observers.contains(observer)) {
            return;
        }

        observers.remove(observer);
    }

}
