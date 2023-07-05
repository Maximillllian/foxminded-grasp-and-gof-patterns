package structural_patterns.composite.tree;

import java.util.List;

public class Node extends TreeElementAbstract {
    private List<TreeElement> children;

    public Node(List<TreeElement> children) {
        this.children = children;
    }

    @Override
    public void increment() {
        value++;
        children.forEach(it -> it.increment());
    }

    @Override
    public void decrement() {
        value--;
        children.forEach(it -> it.decrement());
    }

    @Override
    public Long sum() {
        var sum = value;
        for (var child : children) {
            sum += child.sum();
        }
        return sum;
    }
}
