package behavioral_patterns.observer.src.com.company;

public interface Publisher {
    void subscribe(Observer observer, WindLevel windLevel);
    void unsubscribe(Observer observer,  WindLevel windLevel);
}
