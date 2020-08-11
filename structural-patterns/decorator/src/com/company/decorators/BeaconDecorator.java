package com.company.decorators;

import com.company.IPizza;
import com.company.pizza_components.Beacon;
import com.company.pizza_components.PizzaComponent;

import java.util.List;

public class BeaconDecorator extends PizzaComponentSourceDecorator {

    private IPizza currentPizza;
    private List<PizzaComponent> components;

    public BeaconDecorator(IPizza currentPizza) {
        this.currentPizza = currentPizza;
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Beacon());
        return components;
    }
}
