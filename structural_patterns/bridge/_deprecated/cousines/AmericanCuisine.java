package structural_patterns.bridge._deprecated.cousines;

import structural_patterns.bridge._deprecated.LaunchPart;
import structural_patterns.bridge._deprecated.NationalСuisine;
import structural_patterns.bridge._deprecated.Product;
import structural_patterns.bridge._deprecated.products.Potato;
import structural_patterns.bridge._deprecated.products.Cheeze;

public class AmericanCuisine implements NationalСuisine {

    private LaunchPart launchPart;

    public AmericanCuisine(LaunchPart launchPart) {
        this.launchPart = launchPart;
    }

    @Override
    public void cook() {
        var products = new Product[]
        {
                new Potato(),
                new Cheeze()
        };
        this.launchPart.cook(products);
    }
}
