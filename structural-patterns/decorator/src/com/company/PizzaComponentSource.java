package com.company;

import com.company.pizza_components.Dough;
import com.company.pizza_components.PizzaComponent;

import java.util.List;

public class PizzaComponentSource implements IPizza {
    @Override
    public List<PizzaComponent> addComponent() {
        return List.of(new Dough());
    }
}
