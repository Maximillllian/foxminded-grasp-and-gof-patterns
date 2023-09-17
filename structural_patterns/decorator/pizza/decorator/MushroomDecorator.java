package structural_patterns.decorator.pizza.decorator;

import structural_patterns.decorator.pizza.Pizza;

import java.util.List;

public class MushroomDecorator extends PizzaDecorator {
    protected final List<String> components = List.of("mushroom");

    public MushroomDecorator(Pizza subject) {
        super(subject);
    }

    @Override
    public List<String> decoratorComponents() {
        return components;
    }
}
