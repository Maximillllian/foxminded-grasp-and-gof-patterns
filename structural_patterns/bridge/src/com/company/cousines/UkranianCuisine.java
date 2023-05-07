package com.company.cousines;

import com.company.LaunchPart;
import com.company.NationalСuisine;
import com.company.Product;
import com.company.products.Pasta;
import com.company.products.Potato;

public class UkranianCuisine implements NationalСuisine {

    private LaunchPart launchPart;

    public UkranianCuisine(com.company.LaunchPart launchPart) {
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
