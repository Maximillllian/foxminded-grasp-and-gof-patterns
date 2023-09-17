package structural_patterns.decorator.pizza.decorator;

import structural_patterns.decorator.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza subject;

    public PizzaDecorator(Pizza subject) {
        this.subject = subject;
    }

    public abstract List<String> decoratorComponents();

    public void cook() {
        addComponents(getComponents());
    }

    public void addComponents(List<String> components) {
        var list = new ArrayList<>(components);
        list.addAll(decoratorComponents());
        subject.addComponents(list);
    };

    public List<String> getComponents() {
        return subject.getComponents();
    }

}
