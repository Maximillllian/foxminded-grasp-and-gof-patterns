package com.company.decorators;

import com.company.PizzaComponentAdder;
import com.company.pizza_components.PizzaComponent;

import java.util.List;

public abstract class PizzaComponentAdderDecorator implements PizzaComponentAdder {
    protected PizzaComponentAdder pizzaComponentAdderSource;

    public PizzaComponentAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        this.pizzaComponentAdderSource = pizzaComponentAdderSource;
    }

    @Override
    public List<PizzaComponent> addComponent() {
        return pizzaComponentAdderSource.addComponent();
    }
}
