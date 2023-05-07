package behavioral_patterns.command.src.com.company.commands;

import behavioral_patterns.command.src.com.company.Command;
import behavioral_patterns.command.src.com.company.Pizza;

public class BakeCommand implements Command {

    private Pizza pizza;
    private final int minutes;
    private final int temperature;

    public BakeCommand(Pizza pizza, int minutes, int temperature) {
        this.pizza = pizza;
        this.minutes = minutes;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        System.out.println("Baking pizza of " + pizza.getComponents().size() + " components in "
                + this.minutes + " minutes on " + this.temperature + "C");
    }

    public static Command create(Pizza futurePizza, int minutes, int temperature) {
        return new BakeCommand(futurePizza, minutes, temperature);
    }
}
