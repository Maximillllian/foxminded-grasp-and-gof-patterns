package structural_patterns.composite.tree;

public class Leaf extends TreeElementAbstract {
    @Override
    public void increment() {
        value++;
    }

    @Override
    public void decrement() {
        value--;
    }

    @Override
    public Long sum() {
        return value;
    }
}
