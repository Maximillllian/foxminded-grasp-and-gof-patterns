package structural_patterns.decorator.pizza.decorator;

import structural_patterns.decorator.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class BeaconDecorator extends PizzaDecorator {
    protected final List<String> components = List.of("beacon");

    public BeaconDecorator(Pizza subject) {
        super(subject);
    }

    @Override
    public List<String> decoratorComponents() {
        return components;
    }
}
