package behavioral_patterns.observer.observers;

import behavioral_patterns.observer.Storm;
import behavioral_patterns.observer.StormLevel;
import behavioral_patterns.observer.StormObserver;

public class School extends StormObserver {
    @Override
    public void notify(Storm storm) {
        if (!storm.getLevel().equals(StormLevel.RED)) {
            return;
        }

        System.out.println("Hey, guys, storm, hide!");
    }
}
