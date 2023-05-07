package structural_patterns.decorator.src.com.company.decorators;

import structural_patterns.decorator.src.com.company.PizzaComponentAdder;
import structural_patterns.decorator.src.com.company.pizza_components.PineApple;
import structural_patterns.decorator.src.com.company.pizza_components.PizzaComponent;

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
