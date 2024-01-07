package behavioral_patterns.observer.observers;

import behavioral_patterns.observer.NotificationService;
import behavioral_patterns.observer.Storm;
import behavioral_patterns.observer.StormLevel;
import behavioral_patterns.observer.StormObserver;

public class HighwayService extends StormObserver {
    @Override
    public void notify(Storm storm) {
        if (storm.getLevel().equals(StormLevel.GREEN)) {
            return;
        }

        System.out.println("STOP WORKING, STORM!");
    }
}
