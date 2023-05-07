package structural_patterns.bridge.src.com.company;

import structural_patterns.bridge.src.com.company.cousines.JapaneseCuisine;
import structural_patterns.bridge.src.com.company.launch_parts.Desert;
import structural_patterns.bridge.src.com.company.launch_parts.FirstLaunchPart;
import structural_patterns.bridge.src.com.company.launch_parts.SecondLaunchPart;
import structural_patterns.bridge.src.com.company.launch_parts.ThirdLaunchPart;

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
