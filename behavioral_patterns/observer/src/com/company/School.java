package behavioral_patterns.observer.src.com.company;

public class School implements Observer {
    @Override
    public void notify(String event) {
        System.out.println("school is notified about " + event);
    }
}
