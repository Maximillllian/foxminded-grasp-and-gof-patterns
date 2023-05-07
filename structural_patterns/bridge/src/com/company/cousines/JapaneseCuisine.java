package com.company.cousines;

import com.company.LaunchPart;
import com.company.NationalСuisine;
import com.company.Product;
import com.company.products.Rise;

public class JapaneseCuisine implements NationalСuisine {

    private LaunchPart launchPart;

    public JapaneseCuisine(com.company.LaunchPart launchPart) {
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
