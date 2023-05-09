package structural_patterns.bridge._deprecated;

import structural_patterns.bridge._deprecated.cousines.JapaneseCuisine;
import structural_patterns.bridge._deprecated.launch_parts.Desert;
import structural_patterns.bridge._deprecated.launch_parts.FirstLaunchPart;
import structural_patterns.bridge._deprecated.launch_parts.SecondLaunchPart;
import structural_patterns.bridge._deprecated.launch_parts.ThirdLaunchPart;

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
