package com.company.decorators;

import com.company.IPizza;
import com.company.pizza_components.PineApple;
import com.company.pizza_components.PizzaComponent;

import java.util.List;

public class PineApplesSourceDecorator extends PizzaComponentSourceDecorator {

    private IPizza currentPizza;
    private List<PizzaComponent> components;

    public PineApplesSourceDecorator(IPizza currentPizza) {
        this.currentPizza = currentPizza;
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new PineApple());
        return components;
    }
}
