package behavioral_patterns.observer;

public interface NotificationService {
    void subscribe(StormObserver observer);
    void unsubscribe(StormObserver observer);
}
