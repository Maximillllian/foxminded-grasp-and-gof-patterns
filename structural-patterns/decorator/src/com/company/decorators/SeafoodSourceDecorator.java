package com.company.decorators;

import com.company.IPizza;
import com.company.pizza_components.PizzaComponent;
import com.company.pizza_components.Seafood;

import java.util.List;

public class SeafoodSourceDecorator extends PizzaComponentSourceDecorator {
    private IPizza currentPizza;
    private List<PizzaComponent> components;

    public SeafoodSourceDecorator(IPizza currentPizza) {
        this.currentPizza = currentPizza;
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Seafood());
        return components;
    }
}
