package behavioral_patterns.observer;

import lombok.Getter;

@Getter
public class Storm {
    private final StormLevel level;

    public Storm(StormLevel level) {
        this.level = level;
    }
}
