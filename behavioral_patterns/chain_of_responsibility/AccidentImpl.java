package behavioral_patterns.chain_of_responsibility;

public class AccidentImpl implements Accident {
    private AccidentType accidentType;

    public AccidentImpl(AccidentType accidentType) {
        this.accidentType = accidentType;
    }

    @Override
    public AccidentType getType() {
        return accidentType;
    }
}
