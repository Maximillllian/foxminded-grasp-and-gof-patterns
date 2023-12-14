package behavioral_patterns.command.command;

import behavioral_patterns.command.Pizza;

public class CookPizzaCommand implements CookCommand {
    private Pizza pizza;

    public CookPizzaCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        System.out.println("Pizza is cooking");
        pizza.getComponents().forEach(it -> System.out.println("Adding " + it.toString()));
        System.out.println("Pizza is ready!");
    }
}
