package behavioral_patterns.chain_of_responsibility.handler;

import behavioral_patterns.chain_of_responsibility.Accident;
import behavioral_patterns.chain_of_responsibility.AccidentType;

public class FireguardHandler implements AccidentHandler {
    @Override
    public void handle(Accident accident) {
        if (!AccidentType.FIRE.equals(accident.getType())) {
            return;
        }

        System.out.println("FIRE FIRE FIRE");
    }
}
