package behavioral_patterns.chain_of_responsibility;

import behavioral_patterns.chain_of_responsibility.handler.AccidentHandler;
import behavioral_patterns.chain_of_responsibility.handler.AmbulanceHandler;
import behavioral_patterns.chain_of_responsibility.handler.FireguardHandler;
import behavioral_patterns.chain_of_responsibility.handler.PoliceHandler;

import java.util.List;

public class AccidentRouter {
    private List<AccidentHandler> handlers = List.of(new AmbulanceHandler(), new PoliceHandler(), new FireguardHandler());

    public void handle(Accident accident) {
        handlers.forEach(it -> it.handle(accident));
    }
}
