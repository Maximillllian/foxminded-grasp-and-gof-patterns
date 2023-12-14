package behavioral_patterns.command.deprecated.src.com.company.commands;

import behavioral_patterns.command.deprecated.src.com.company.Command;
import behavioral_patterns.command.deprecated.src.com.company.Pizza;
import behavioral_patterns.command.deprecated.src.com.company.PizzaComponent;

public class ComponentAddCommand implements Command {

    PizzaComponent pizzaComponent;
    Pizza pizza;

    protected ComponentAddCommand(Pizza futurePizza, PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
        this.pizza = futurePizza;
    }

    @Override
    public void execute() {
        pizza.addComponent(this.pizzaComponent);
    }

    public static Command create(Pizza futurePizza, PizzaComponent pizzaComponent) {
        return new ComponentAddCommand(futurePizza, pizzaComponent);
    }
}
