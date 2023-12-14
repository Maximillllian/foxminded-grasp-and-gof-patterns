package behavioral_patterns.chain_of_responsibility.handler;

import behavioral_patterns.chain_of_responsibility.Accident;
import behavioral_patterns.chain_of_responsibility.AccidentType;

public abstract class AccidentHandler {
    protected AccidentHandler nextHandler;

    public void setNextHandler(AccidentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Accident accident) {
        handleNext(accident);
    };

    private void handleNext(Accident accident) {
        if (nextHandler == null) {
            return;
        }

        nextHandler.handle(accident);
    };
}
