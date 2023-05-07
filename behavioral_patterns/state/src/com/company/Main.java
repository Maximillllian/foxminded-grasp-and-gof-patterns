package behavioral_patterns.state.src.com.company;

public class Main {

    public static void main(String[] args) {
        IOven oven = new Oven(25);
        for (int i = 0; i < 8; i++) {
            oven.increaseTemperature();
            try {
                oven.bake();
                return;
            } catch (Exception ex) {
                System.out.println("can't bake when " + oven.getTemperature() + "C");
            }
        }
    }
}
