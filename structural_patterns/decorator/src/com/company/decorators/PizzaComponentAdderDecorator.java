package structural_patterns.decorator.src.com.company.decorators;

import structural_patterns.decorator.src.com.company.PizzaComponentAdder;
import structural_patterns.decorator.src.com.company.pizza_components.PizzaComponent;

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
