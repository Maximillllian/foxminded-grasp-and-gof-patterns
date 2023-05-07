package structural_patterns.composite.src.com.company;

public class Tree implements ITree {

    private Component root;

    @Override
    public void add(int value) {
        root.add(value);
    }

    @Override
    public void increment(int value) {
        root.increment();
    }
}
