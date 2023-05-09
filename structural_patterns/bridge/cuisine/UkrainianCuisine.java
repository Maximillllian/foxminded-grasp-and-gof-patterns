package structural_patterns.bridge.cuisine;

public class UkrainianCuisine implements Cuisine {
    @Override
    public void cookFirstCourse() {
        System.out.println("ukrainian first course cooking");
    }

    @Override
    public void cookSecondCourse() {
        System.out.println("ukrainian second course cooking");
    }

    @Override
    public void cookThirdCourse() {
        System.out.println("ukrainian third course cooking");
    }

    @Override
    public void cookDessert() {
        System.out.println("ukrainian dessert cooking");
    }
}
