package structural_patterns.decorator.pizza.decorator;

import structural_patterns.decorator.pizza.Pizza;

import java.util.List;

public class CheeseDecorator extends PizzaDecorator {
    protected final List<String> components = List.of("cheese");

    public CheeseDecorator(Pizza subject) {
        super(subject);
    }

    @Override
    public List<String> decoratorComponents() {
        return components;
    }
}
