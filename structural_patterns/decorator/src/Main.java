package structural_patterns.decorator.src;


import structural_patterns.decorator.src.com.company.DoughAdderSource;
import structural_patterns.decorator.src.com.company.decorators.BeaconAdderDecorator;
import structural_patterns.decorator.src.com.company.decorators.CheezeAdderDecorator;

public class Main {
    public static void main(String[] args) {
        var decorator = new BeaconAdderDecorator(new CheezeAdderDecorator(new DoughAdderSource()));
        decorator.addComponent();
    }
}
