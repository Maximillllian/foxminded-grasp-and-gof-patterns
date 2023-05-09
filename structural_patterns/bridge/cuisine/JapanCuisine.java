package structural_patterns.bridge.cuisine;

public class JapanCuisine implements Cuisine {
    @Override
    public void cookFirstCourse() {
        System.out.println("japan first course cooking");
    }

    @Override
    public void cookSecondCourse() {
        System.out.println("japan second course cooking");
    }

    @Override
    public void cookThirdCourse() {
        System.out.println("japan third course cooking");
    }

    @Override
    public void cookDessert() {
        System.out.println("japan dessert cooking");
    }
}
