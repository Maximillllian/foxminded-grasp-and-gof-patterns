package behavioral_patterns.chain_of_responsibility.handler;

import behavioral_patterns.chain_of_responsibility.Accident;
import behavioral_patterns.chain_of_responsibility.AccidentType;

public interface AccidentHandler {
    void handle(Accident accident);
}
