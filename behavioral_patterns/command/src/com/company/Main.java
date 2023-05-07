package behavioral_patterns.command.src.com.company;

public class Main {

    public static void main(String[] args) {
        var pizzaMaker = new PizzaMaker();

        pizzaMaker.addComponent("beacon", 50);
        pizzaMaker.addComponent("cheeze", 100);
        pizzaMaker.bake(10, 200);

        pizzaMaker.cookPizza();
    }
}
