package structural_patterns.decorator.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaImpl implements Pizza {
    private List<String> components = new ArrayList<>();

    public PizzaImpl() {};

    @Override
    public void cook() {

    }

    public void addComponents(List<String> components) {
        this.components.addAll(components);
    }

    @Override
    public List<String> getComponents() {
        return components;
    }
}
