package behavioral_patterns.command;

import behavioral_patterns.command.command.AddComponentCommand;

public class Main {
    public static void main(String[] args) {
        var pizza = new Pizza();
        var beaconCommand = new AddComponentCommand(new PizzaComponent(10, ExtraItemType.BEACON), pizza);
        var cheeseCommand = new AddComponentCommand(new PizzaComponent(5, ExtraItemType.CHEESE), pizza);
        pizza.addCommand(beaconCommand);
        pizza.addCommand(cheeseCommand);

        pizza.cook();
    }
}
