package structural_patterns.decorator.deprecated.src.com;

import structural_patterns.decorator.deprecated.src.com.pizza_components.Dough;
import structural_patterns.decorator.deprecated.src.com.pizza_components.PizzaComponent;

import java.util.LinkedList;
import java.util.List;

public class DoughAdderSource implements PizzaComponentAdder {
    @Override
    public List<PizzaComponent> addComponent() {
        System.out.println("dough added");
        var list = new LinkedList<PizzaComponent>();
        list.add(new Dough());
        return list;
    }
}
