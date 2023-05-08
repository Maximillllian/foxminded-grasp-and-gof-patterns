package creational_patterns.prototype.car;

import lombok.Getter;

@Getter
public class Car implements Cloneable {
    private String color;
    private String number;
    private CarType type;

    public Car(CarType type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
