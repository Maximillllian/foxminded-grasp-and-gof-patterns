package behavioral_patterns.command.src.com.company;

public abstract class PizzaComponent {
    protected int grams;

    public PizzaComponent(int grams) {
        this.grams = grams;
    }
}
