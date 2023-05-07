package com.company.decorators;

import com.company.PizzaComponentAdder;
import com.company.pizza_components.PizzaComponent;
import com.company.pizza_components.Seafood;

import java.util.List;

public class SeafoodAdderDecorator extends PizzaComponentAdderDecorator {
    private List<PizzaComponent> components;

    public SeafoodAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        super(pizzaComponentAdderSource);
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Seafood());
        System.out.println("Seafood added");
        return components;
    }
}
