package structural_patterns.decorator.pizza;

import java.util.List;

public interface Pizza {
    void cook();
    void addComponents(List<String> component);
    List<String> getComponents();
}
