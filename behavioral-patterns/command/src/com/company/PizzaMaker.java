package com.company;

import com.company.commands.BakeCommand;
import com.company.commands.ComponentAddCommand;
import com.company.components.*;

import java.util.LinkedList;
import java.util.Queue;

public class PizzaMaker {
    private Queue<Command> actions;
    private Pizza pizza;

    public PizzaMaker() {
        actions = new LinkedList<>();
        pizza = new Pizza();
    }

    public void addComponent(String componentName, int grams) {
        PizzaComponent pizzaComponent = switch (componentName) {
            case "beacon" -> new Beacon(grams);
            case "cheeze" -> new Cheeze(grams);
            case "mushroomes" -> new Mushrooms(grams);
            case "pineapples" -> new PineApples(grams);
            case "seafood" -> new Seafood(grams);
            default -> throw new IllegalArgumentException();
        };

        Command command = ComponentAddCommand.create(this.pizza, pizzaComponent);
        actions.add(command);
    }

    public void bake(int minutes, int temperature) {
        actions.add(BakeCommand.create(this.pizza, minutes, temperature));
    }

    public void cookPizza() {
        while (!actions.isEmpty()) {
            Command action = actions.remove();
            action.execute();
        }
    }
}
