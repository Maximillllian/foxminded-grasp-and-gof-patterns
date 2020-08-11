package com.company.decorators;

import com.company.IPizza;
import com.company.pizza_components.Mushrooms;
import com.company.pizza_components.PizzaComponent;

import java.util.List;

public class MushroomsSourceDecorator extends PizzaComponentSourceDecorator {
    private IPizza currentPizza;
    private List<PizzaComponent> components;

    public MushroomsSourceDecorator(IPizza currentPizza) {
        this.currentPizza = currentPizza;
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Mushrooms());
        return components;
    }
}
