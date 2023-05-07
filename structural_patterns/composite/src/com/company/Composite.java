package structural_patterns.composite.src.com.company;

import java.util.List;

public class Composite implements Component {

    private List<Component> components;

    @Override
    public void increment() {
        for (var component: this.components) {
            component.increment();
        }
    }

    @Override
    public void add(int value) {
        components.add(new Leaf(value));
    }
}
