package structural_patterns.bridge.src.com.company.cousines;

import structural_patterns.bridge.src.com.company.LaunchPart;
import structural_patterns.bridge.src.com.company.NationalСuisine;
import structural_patterns.bridge.src.com.company.Product;
import structural_patterns.bridge.src.com.company.products.Pasta;
import structural_patterns.bridge.src.com.company.products.Potato;

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
