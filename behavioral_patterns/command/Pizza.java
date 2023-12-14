package behavioral_patterns.command;

import behavioral_patterns.command.command.CookCommand;
import behavioral_patterns.command.command.CookPizzaCommand;
import behavioral_patterns.command.deprecated.src.com.company.Command;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Pizza {
    @Getter
    private List<PizzaComponent> components = new ArrayList<>();
    private List<CookCommand> commands = new ArrayList<>();

    public void addCommand(CookCommand command) {
        this.commands.add(command);
    }

    public void addComponent(PizzaComponent component) {
        this.components.add(component);
    }

    public void cook() {
        commands.forEach(it -> it.execute());
        var command = new CookPizzaCommand(this);
        command.execute();
    }
}
