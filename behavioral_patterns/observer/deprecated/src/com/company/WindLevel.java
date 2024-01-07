package behavioral_patterns.observer.deprecated.src.com.company;

public enum WindLevel {
    Calm(0),
    Quiet(1),
    Light(2),
    Weak(3),
    Moderate(4),
    Strong(5),
    VeryStrong(6),
    Storm(7),
    HeavyStorm(8),
    BrutalStorm(9),
    Hurricane(10);

    final int value;

    private WindLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
