package structural_patterns.bridge.cuisine;

public class AmericanCuisine implements Cuisine {
    @Override
    public void cookFirstCourse() {
        System.out.println("american first course cooking");
    }

    @Override
    public void cookSecondCourse() {
        System.out.println("american second course cooking");
    }

    @Override
    public void cookThirdCourse() {
        System.out.println("american third course cooking");
    }

    @Override
    public void cookDessert() {
        System.out.println("american dessert cooking");
    }
}
