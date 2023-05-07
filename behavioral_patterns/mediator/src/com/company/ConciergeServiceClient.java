package behavioral_patterns.mediator.src.com.company;

public class ConciergeServiceClient{
    private String name;

    public void notify(String event) {
        System.out.println("client received: " + event);
    }

    public ConciergeServiceClient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
