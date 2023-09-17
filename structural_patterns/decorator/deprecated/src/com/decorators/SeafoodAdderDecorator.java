package structural_patterns.decorator.deprecated.src.com.decorators;

import structural_patterns.decorator.deprecated.src.com.PizzaComponentAdder;
import structural_patterns.decorator.deprecated.src.com.pizza_components.PizzaComponent;
import structural_patterns.decorator.deprecated.src.com.pizza_components.Seafood;

import java.util.List;

public class SeafoodAdderDecorator extends PizzaComponentAdderDecorator {
    private List<PizzaComponent> components;

    public SeafoodAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        super(pizzaComponentAdderSource);
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Seafood());
        System.out.println("Seafood added");
        return components;
    }
}
