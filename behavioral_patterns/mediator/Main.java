package behavioral_patterns.mediator;

public class Main {
    public static void main(String[] args) {
        var service = new ConciergeService();
        var customer = new Customer("Max");

        service.sendMessage(customer, ConciergeServiceEventType.CALL_TAXI);
        service.sendMessage(customer, ConciergeServiceEventType.FLOWER_DELIVERY);
        service.sendMessage(customer, ConciergeServiceEventType.HOUSE_MASTER);
    }
}
