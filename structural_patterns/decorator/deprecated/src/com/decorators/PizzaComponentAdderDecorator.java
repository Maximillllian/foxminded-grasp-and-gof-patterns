package structural_patterns.decorator.deprecated.src.com.decorators;

import structural_patterns.decorator.deprecated.src.com.PizzaComponentAdder;
import structural_patterns.decorator.deprecated.src.com.pizza_components.PizzaComponent;

import java.util.List;

public abstract class PizzaComponentAdderDecorator implements PizzaComponentAdder {
    protected PizzaComponentAdder pizzaComponentAdderSource;

    public PizzaComponentAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        this.pizzaComponentAdderSource = pizzaComponentAdderSource;
    }

    @Override
    public List<PizzaComponent> addComponent() {
        return pizzaComponentAdderSource.addComponent();
    }
}
