package creational_patterns.builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var pizza = Pizza.builder()
            .cheese(askToAddIngredient("cheese"))
            .bacon(askToAddIngredient("bacon"))
            .crustaceans(askToAddIngredient("crustaceans"))
            .mushrooms(askToAddIngredient("mushrooms"))
            .pineapples(askToAddIngredient("pineapples"))
            .build();
        System.out.println("pizza - " + pizza);
    }

    private static String readInput() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static Boolean readBoolean() {
        String yes = "yes";
        String no = "no";

        return readInput().equals(yes);
    }

    private static Boolean askToAddIngredient(String ingredient) {
        System.out.println("Do you want to add " + ingredient + "? yes/no");
        return readBoolean();
    }
}
