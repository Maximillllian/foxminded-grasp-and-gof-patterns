package behavioral_patterns.observer;

import behavioral_patterns.observer.Storm;

public abstract class StormObserver {
    public abstract void notify(Storm storm);
    public void subscribe(NotificationService service) {
        service.subscribe(this);
    };

    public void unsubscribe(NotificationService service) {
        service.unsubscribe(this);
    }
}
