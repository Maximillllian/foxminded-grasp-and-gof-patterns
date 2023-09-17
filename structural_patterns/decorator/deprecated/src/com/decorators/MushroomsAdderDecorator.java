package structural_patterns.decorator.deprecated.src.com.decorators;

import structural_patterns.decorator.deprecated.src.com.PizzaComponentAdder;
import structural_patterns.decorator.deprecated.src.com.pizza_components.Mushrooms;
import structural_patterns.decorator.deprecated.src.com.pizza_components.PizzaComponent;

import java.util.List;

public class MushroomsAdderDecorator extends PizzaComponentAdderDecorator {
    private List<PizzaComponent> components;

    public MushroomsAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        super(pizzaComponentAdderSource);
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Mushrooms());
        System.out.println("Mushrooms added");
        return components;
    }
}
