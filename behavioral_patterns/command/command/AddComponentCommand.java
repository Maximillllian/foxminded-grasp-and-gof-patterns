package behavioral_patterns.command.command;

import behavioral_patterns.command.Pizza;
import behavioral_patterns.command.PizzaComponent;

public class AddComponentCommand implements CookCommand {
    private Pizza pizza;
    private PizzaComponent component;

    public AddComponentCommand(PizzaComponent component, Pizza pizza) {
        this.component = component;
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        pizza.addComponent(component);
    }
}
