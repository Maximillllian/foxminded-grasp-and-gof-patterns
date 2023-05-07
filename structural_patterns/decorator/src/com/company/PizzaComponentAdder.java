package structural_patterns.decorator.src.com.company;

import structural_patterns.decorator.src.com.company.pizza_components.PizzaComponent;

import java.util.List;

public interface PizzaComponentAdder {
    List<PizzaComponent> addComponent();
}
