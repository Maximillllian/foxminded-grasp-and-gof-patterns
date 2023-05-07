package structural_patterns.bridge.src.com.company.cousines;

import structural_patterns.bridge.src.com.company.LaunchPart;
import structural_patterns.bridge.src.com.company.NationalСuisine;
import structural_patterns.bridge.src.com.company.Product;
import structural_patterns.bridge.src.com.company.products.Cheeze;
import structural_patterns.bridge.src.com.company.products.Potato;

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
