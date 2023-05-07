package structural_patterns.decorator.src.com.company.decorators;

import structural_patterns.decorator.src.com.company.PizzaComponentAdder;
import structural_patterns.decorator.src.com.company.pizza_components.Mushrooms;
import structural_patterns.decorator.src.com.company.pizza_components.PizzaComponent;

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
