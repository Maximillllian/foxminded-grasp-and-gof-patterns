package structural_patterns.bridge._deprecated.cousines;

import structural_patterns.bridge._deprecated.LaunchPart;
import structural_patterns.bridge._deprecated.NationalСuisine;
import structural_patterns.bridge._deprecated.Product;
import structural_patterns.bridge._deprecated.products.Rise;

public class JapaneseCuisine implements NationalСuisine {

    private LaunchPart launchPart;

    public JapaneseCuisine(LaunchPart launchPart) {
        this.launchPart = launchPart;
    }

    @Override
    public void cook() {
        var products = new Product[]
                {
                        new Rise(),
                };
        this.launchPart.cook(products);
    }
}
