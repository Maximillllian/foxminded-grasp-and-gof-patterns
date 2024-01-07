package behavioral_patterns.observer.deprecated.src.com.company;

import java.util.HashMap;
import java.util.Map;

public class StormAlarmer implements Publisher {

    private float windVelocity;
    private Map<Observer, WindLevel> observers;

    private final static int MIN_STORM_VELOCITY = 20;

    public StormAlarmer(int windVelocity) {
        this.windVelocity = windVelocity;
        this.observers = new HashMap<>();
    }

    public void setWindVelocity(float windVelocity) {
        if (windVelocity < 0) {
            throw new IllegalArgumentException("negative velocity");
        }
        WindLevel newWindLevel = getWindLevelByVelocity(windVelocity);
        WindLevel currentWindLevel = getWindLevelByVelocity(this.windVelocity);

        observers.forEach((observer, minWindLevel) -> {
            if (minWindLevel.getValue() <= newWindLevel.getValue() && newWindLevel.getValue() != currentWindLevel.getValue()) {
                observer.notify(newWindLevel.toString() + " starts");
            }
        });
        this.windVelocity = windVelocity;

    }

    @Override
    public void subscribe(Observer observer, WindLevel windLevel) {
        observers.put(observer, windLevel);
        WindLevel currentWindLevel = getWindLevelByVelocity(this.windVelocity);
        if (windLevel.getValue() <= currentWindLevel.getValue()) {
            observer.notify(currentWindLevel.toString() + " is now");
        }
    }

    @Override
    public void unsubscribe(Observer observer, WindLevel windLevel) {
        observers.remove(observer);
    }

    private static WindLevel getWindLevelByVelocity(float velocity) {
        if (velocity >= 0 && velocity < 0.2) {
            return WindLevel.Calm;
        } else if (velocity >= 0.2 && velocity < 1.5) {
            return WindLevel.Quiet;
        } else if (velocity >= 1.5 && velocity < 3.3) {
            return WindLevel.Light;
        } else if (velocity >= 3.3 && velocity < 5.4) {
            return WindLevel.Weak;
        } else if (velocity >= 5.5 && velocity < 7.9) {
            return WindLevel.Moderate;
        } else if (velocity >= 8 && velocity < 13.8) {
            return WindLevel.Strong;
        } else if (velocity >= 13.8 && velocity < 20.7) {
            return WindLevel.VeryStrong;
        } else if (velocity >= 20.7 && velocity < 24.4) {
            return WindLevel.Storm;
        } else if (velocity >= 24.4 && velocity < 28.4) {
            return WindLevel.HeavyStorm;
        } else if (velocity > 28.4 && velocity < 32.6) {
            return WindLevel.BrutalStorm;
        } else {
            return WindLevel.Hurricane;
        }
    }
}
