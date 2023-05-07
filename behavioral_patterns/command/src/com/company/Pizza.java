package behavioral_patterns.command.src.com.company;

import behavioral_patterns.command.src.com.company.components.Dough;

import java.util.LinkedList;
import java.util.List;

public class Pizza {
    private List<PizzaComponent> components;

    private static final int DEFAULT_DOUGH_GRAMS = 200;

    protected Pizza() {
        components = new LinkedList<>();
        components.add(new Dough(DEFAULT_DOUGH_GRAMS));
    }

    public void addComponent(PizzaComponent pizzaComponent) {
        components.add(pizzaComponent);
    }

    public List<PizzaComponent> getComponents() {
        return components;
    }

    public static Pizza create() {
        return new Pizza();
    }
}
