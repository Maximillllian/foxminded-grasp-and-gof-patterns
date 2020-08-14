package com.company.decorators;

import com.company.PizzaComponentAdder;
import com.company.pizza_components.Beacon;
import com.company.pizza_components.PizzaComponent;

import java.util.List;

public class BeaconAdderDecorator extends PizzaComponentAdderDecorator {

    private List<PizzaComponent> components;

    public BeaconAdderDecorator(PizzaComponentAdder pizzaComponentAdderSource) {
        super(pizzaComponentAdderSource);
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Beacon());
        System.out.println("Beacon added");
        return components;
    }
}
