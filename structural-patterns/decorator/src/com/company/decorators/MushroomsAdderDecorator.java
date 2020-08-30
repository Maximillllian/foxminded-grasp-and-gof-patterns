package com.company.decorators;

import com.company.PizzaComponentAdder;
import com.company.pizza_components.Mushrooms;
import com.company.pizza_components.PizzaComponent;

import java.util.List;

public class MushroomsAdderDecorator extends PizzaComponentAdderDecorator {
    private List<PizzaComponent> components;

    public MushroomsAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        super(pizzaComponentAdderSource);
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Mushrooms());
        System.out.println("Mushrooms added");
        return components;
    }
}
