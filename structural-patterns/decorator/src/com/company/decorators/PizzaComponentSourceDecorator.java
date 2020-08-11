package com.company.decorators;

import com.company.IPizza;
import com.company.pizza_components.PizzaComponent;

import java.util.List;

public abstract class PizzaComponentSourceDecorator implements IPizza {
    protected IPizza pizzaComponentSource;

    @Override
    public List<PizzaComponent> addComponent() {
        return pizzaComponentSource.addComponent();
    }
}
