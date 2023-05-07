package structural_patterns.bridge.src.com.company.cousines;

import structural_patterns.bridge.src.com.company.LaunchPart;
import structural_patterns.bridge.src.com.company.NationalСuisine;
import structural_patterns.bridge.src.com.company.Product;
import structural_patterns.bridge.src.com.company.products.Rise;

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
