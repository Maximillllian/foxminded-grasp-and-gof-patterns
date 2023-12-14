package behavioral_patterns.chain_of_responsibility.handler;

import behavioral_patterns.chain_of_responsibility.Accident;
import behavioral_patterns.chain_of_responsibility.AccidentType;

public class PoliceHandler extends AccidentHandler {
    @Override
    public void handle(Accident accident) {
        if (!AccidentType.CRIME.equals(accident.getType())) {
            super.handle(accident);
            return;
        }

        System.out.println("FREEZE! You are under arrest");
    }
}
