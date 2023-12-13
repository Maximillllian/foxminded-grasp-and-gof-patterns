package behavioral_patterns.chain_of_responsibility.deprecated.src;

import behavioral_patterns.chain_of_responsibility.deprecated.src.entities.Accident;

public abstract class BaseEmergencyCallHandler implements EmergencyCallHandler {

    protected BaseEmergencyCallHandler nextHandler;

    public void setNextHandler(BaseEmergencyCallHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Accident accident) {
        if (nextHandler != null) {
            nextHandler.handle(accident);
        }
    }
}
