package behavioral_patterns.chain_of_responsibility.src;

import behavioral_patterns.chain_of_responsibility.src.entities.Accident;

public interface EmergencyCallHandler {
    void setNextHandler(BaseEmergencyCallHandler nextHandler);
    void handle(Accident accident);
}
