package structural_patterns.decorator.src.com.company.decorators;

import structural_patterns.decorator.src.com.company.PizzaComponentAdder;
import structural_patterns.decorator.src.com.company.pizza_components.Cheeze;
import structural_patterns.decorator.src.com.company.pizza_components.PizzaComponent;

import java.util.ArrayList;
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
