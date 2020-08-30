package com.company.cousines;

import com.company.LaunchPart;
import com.company.NationalСuisine;
import com.company.Product;
import com.company.products.Cheeze;
import com.company.products.Potato;

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
