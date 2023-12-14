package behavioral_patterns.chain_of_responsibility;

import behavioral_patterns.chain_of_responsibility.handler.AccidentHandler;
import behavioral_patterns.chain_of_responsibility.handler.AmbulanceHandler;
import behavioral_patterns.chain_of_responsibility.handler.FireguardHandler;
import behavioral_patterns.chain_of_responsibility.handler.PoliceHandler;

import java.util.List;

public class AccidentRouter {
    public void handle(Accident accident) {
        var ambulanceHandler = new AmbulanceHandler();
        var policeHandler = new PoliceHandler();
        ambulanceHandler.setNextHandler(policeHandler);
        policeHandler.setNextHandler(new FireguardHandler());

        ambulanceHandler.handle(accident);
    }
}
