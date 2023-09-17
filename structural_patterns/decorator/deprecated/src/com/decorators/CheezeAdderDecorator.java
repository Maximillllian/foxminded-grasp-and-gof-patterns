package structural_patterns.decorator.deprecated.src.com.decorators;

import structural_patterns.decorator.deprecated.src.com.PizzaComponentAdder;
import structural_patterns.decorator.deprecated.src.com.pizza_components.Cheeze;
import structural_patterns.decorator.deprecated.src.com.pizza_components.PizzaComponent;

import java.util.List;

public class CheezeAdderDecorator extends PizzaComponentAdderDecorator {

    private List<PizzaComponent> components;

    public CheezeAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        super(pizzaComponentAdderSource);
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Cheeze());
        System.out.println("Cheeze added");
        return components;
    }
}
