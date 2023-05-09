package structural_patterns.bridge._deprecated.cousines;

import structural_patterns.bridge._deprecated.LaunchPart;
import structural_patterns.bridge._deprecated.NationalСuisine;
import structural_patterns.bridge._deprecated.Product;
import structural_patterns.bridge._deprecated.products.Pasta;
import structural_patterns.bridge._deprecated.products.Potato;

public class UkranianCuisine implements NationalСuisine {

    private LaunchPart launchPart;

    public UkranianCuisine(LaunchPart launchPart) {
        this.launchPart = launchPart;
    }

    @Override
    public void cook() {
        var products = new Product[]
                {
                        new Potato(),
                        new Pasta()
                };
        this.launchPart.cook(products);
    }
}
