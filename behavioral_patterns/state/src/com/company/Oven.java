package behavioral_patterns.state.src.com.company;

public class Oven implements IOven {

    private static final int TEMPERATURE_STEP = 25;
    private static final int MIN_OVERHEAT_TEMPERATURE = 250;
    private static final int MAX_SUBCOLD_TEMPERATURE = 150;

    private int temperature;
    private IState state;

    public Oven(int temperature) {
        this.temperature = temperature;
        trySetNewState();
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        this.temperature += TEMPERATURE_STEP;
        trySetNewState();
    }

    public void decreaseTemperature() {
        this.temperature -= TEMPERATURE_STEP;
        trySetNewState();
    }

    public void bake() {
        this.state.bake();
    }

    private interface IState {
        void bake();
    }

    private void trySetNewState() {
        if (state == null) {
            if (this.temperature >= MIN_OVERHEAT_TEMPERATURE) {
                state = new OverheatedState();
            } else if (this.temperature <= MAX_SUBCOLD_TEMPERATURE) {
                state = new SubcooledState();
            } else {
                state = new NormalState();
            }
        } else if (this.temperature >= MIN_OVERHEAT_TEMPERATURE && !(state instanceof OverheatedState)) {
            state = new OverheatedState();
        } else if (this.temperature <= MAX_SUBCOLD_TEMPERATURE && !(state instanceof SubcooledState)) {
            state = new SubcooledState();
        } else if (this.temperature > MAX_SUBCOLD_TEMPERATURE &&
                this.temperature < MIN_OVERHEAT_TEMPERATURE &&
                !(state instanceof NormalState)) {
            state = new NormalState();
        }
    }

    private class OverheatedState implements IState {

        @Override
        public void bake() {
            throw new IllegalStateException("temperature " + getTemperature() + " is too high");
        }
    }

    private class NormalState implements IState {

        @Override
        public void bake() {
            System.out.println("baking bread on " + getTemperature() + "...");
        }
    }

    private class SubcooledState implements IState {

        @Override
        public void bake() {
            throw new IllegalStateException("temperature " + getTemperature() + " is too cold");
        }
    }
}
