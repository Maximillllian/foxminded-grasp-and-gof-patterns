package behavioral_patterns.chain_of_responsibility.deprecated.src;

import behavioral_patterns.chain_of_responsibility.deprecated.src.entities.Accident;

public interface EmergencyCallHandler {
    void setNextHandler(BaseEmergencyCallHandler nextHandler);
    void handle(Accident accident);
}
