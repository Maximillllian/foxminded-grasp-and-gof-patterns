package behavioral_patterns.state.src.com.company;

public interface IOven {
    void increaseTemperature();
    void decreaseTemperature();
    void bake();
    int getTemperature();
}
