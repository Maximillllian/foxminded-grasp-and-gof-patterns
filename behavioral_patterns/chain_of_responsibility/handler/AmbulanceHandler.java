package behavioral_patterns.chain_of_responsibility.handler;

import behavioral_patterns.chain_of_responsibility.Accident;
import behavioral_patterns.chain_of_responsibility.AccidentType;

public class AmbulanceHandler extends AccidentHandler {
    @Override
    public void handle(Accident accident) {
        if (!AccidentType.INJURY.equals(accident.getType())) {
            super.handle(accident);
            return;
        }

        System.out.println("HELP HELP, THE PATIENT IS DYING");
    }
}
