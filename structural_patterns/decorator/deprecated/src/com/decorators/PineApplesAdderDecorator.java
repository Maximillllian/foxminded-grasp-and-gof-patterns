package structural_patterns.decorator.deprecated.src.com.decorators;

import structural_patterns.decorator.deprecated.src.com.PizzaComponentAdder;
import structural_patterns.decorator.deprecated.src.com.pizza_components.PineApple;
import structural_patterns.decorator.deprecated.src.com.pizza_components.PizzaComponent;

import java.util.List;

public class PineApplesAdderDecorator extends PizzaComponentAdderDecorator {

    private List<PizzaComponent> components;

    public PineApplesAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        super(pizzaComponentAdderSource);
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new PineApple());
        System.out.println("PineApple added");
        return components;
    }
}
