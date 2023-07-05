package structural_patterns.composite;

import structural_patterns.composite.tree.Leaf;
import structural_patterns.composite.tree.Node;
import structural_patterns.composite.tree.TreeElement;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var root = new Node(List.of(
            new Leaf(),
            new Node(List.of(new Leaf())),
            new Node(List.of(new Leaf(), new Node(List.of(new Leaf()))))
        )
        );
        root.increment();
        System.out.println(root.sum());
        root.decrement();
        System.out.println(root.sum());
    }
}
