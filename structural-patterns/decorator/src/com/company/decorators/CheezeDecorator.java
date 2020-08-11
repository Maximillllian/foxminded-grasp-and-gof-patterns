package com.company.decorators;

import com.company.IPizza;
import com.company.pizza_components.Cheeze;
import com.company.pizza_components.PizzaComponent;

import java.util.List;

public class CheezeDecorator extends PizzaComponentSourceDecorator {

    private IPizza currentPizza;
    private List<PizzaComponent> components;

    public CheezeDecorator(IPizza currentPizza) {
        this.currentPizza = currentPizza;
    }

    @Override
    public List<PizzaComponent> addComponent() {
        components = super.addComponent();
        components.add(new Cheeze());
        return components;
    }
}
