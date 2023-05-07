package behavioral_patterns.chain_of_responsibility.src;

import behavioral_patterns.chain_of_responsibility.src.entities.Accident;
import behavioral_patterns.chain_of_responsibility.src.entities.Fire;

public class FireDepartment extends BaseEmergencyCallHandler {

    @Override
    public void handle(Accident accident) {
        if (canHandle(accident)) {
            System.out.println("putting out the fire");
        }
        else {
            super.handle(accident);
        }
    }

    private boolean canHandle(Accident accident) {
        return accident instanceof Fire;
    }
}
