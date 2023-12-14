package behavioral_patterns.command;

public class PizzaComponent {
    private int grams;
    private ExtraItemType type;

    public PizzaComponent(int grams, ExtraItemType type) {
        this.grams = grams;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + ", "  + grams + " г.";
    }
}
