package structural_patterns.decorator.src.com.company.decorators;

import structural_patterns.decorator.src.com.company.PizzaComponentAdder;
import structural_patterns.decorator.src.com.company.pizza_components.PizzaComponent;
import structural_patterns.decorator.src.com.company.pizza_components.Seafood;

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
