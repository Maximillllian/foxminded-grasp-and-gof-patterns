package com.company;

import com.company.cousines.JapaneseCuisine;
import com.company.launch_parts.Desert;
import com.company.launch_parts.FirstLaunchPart;
import com.company.launch_parts.SecondLaunchPart;
import com.company.launch_parts.ThirdLaunchPart;

public class Main {

    public static void main(String[] args) {
        var launchParts = new LaunchPart[]
                {
                    new FirstLaunchPart(),
                    new SecondLaunchPart(),
                    new ThirdLaunchPart(),
                    new Desert()
                };

        for (var launchPart : launchParts) {
            var cuisine = new JapaneseCuisine(launchPart);
            cuisine.cook();
        };
    }
}
