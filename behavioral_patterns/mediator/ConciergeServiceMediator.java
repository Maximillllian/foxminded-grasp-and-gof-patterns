package behavioral_patterns.mediator;

public interface ConciergeServiceMediator {
    void sendMessage(Customer sender, ConciergeServiceEventType eventType);
}
