package behavioral_patterns.observer.observers;

import behavioral_patterns.observer.NotificationService;
import behavioral_patterns.observer.Storm;
import behavioral_patterns.observer.StormObserver;

public class Airport extends StormObserver {
    @Override
    public void notify(Storm storm) {
        System.out.println("NOOOO WE ARE DEAD...");
    }
}
