package structural_patterns.decorator.deprecated.src;


import structural_patterns.decorator.deprecated.src.com.DoughAdderSource;
import structural_patterns.decorator.deprecated.src.com.decorators.BeaconAdderDecorator;
import structural_patterns.decorator.deprecated.src.com.decorators.CheezeAdderDecorator;

public class Main {
    public static void main(String[] args) {
        var decorator = new BeaconAdderDecorator(new CheezeAdderDecorator(new DoughAdderSource()));
        decorator.addComponent();
    }
}
