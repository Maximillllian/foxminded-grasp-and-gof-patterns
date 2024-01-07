package behavioral_patterns.observer.deprecated.src.com.company;

public class RoadService implements Observer {
    @Override
    public void notify(String event) {
        System.out.println("RoadService is notified about " + event);
    }
}
