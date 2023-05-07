package behavioral_patterns.chain_of_responsibility.src;

import behavioral_patterns.chain_of_responsibility.src.entities.Accident;
import behavioral_patterns.chain_of_responsibility.src.entities.Injury;

public class Ambulance extends BaseEmergencyCallHandler {
    @Override
    public void handle(Accident accident) {
        if (canHandle(accident)) {
            System.out.println("saving lifes");
        }
        super.handle(accident);
    }

    private boolean canHandle(Accident accident) {
        return accident instanceof Injury;
    }
}
