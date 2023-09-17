package structural_patterns.decorator.deprecated.src.com.decorators;

import structural_patterns.decorator.deprecated.src.com.PizzaComponentAdder;
import structural_patterns.decorator.deprecated.src.com.pizza_components.Beacon;
import structural_patterns.decorator.deprecated.src.com.pizza_components.PizzaComponent;

import java.util.List;

public class BeaconAdderDecorator extends PizzaComponentAdderDecorator {

    private List<PizzaComponent> components;

    public BeaconAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        super(pizzaComponentAdderSource);
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Beacon());
        System.out.println("Beacon added");
        return components;
    }
}
