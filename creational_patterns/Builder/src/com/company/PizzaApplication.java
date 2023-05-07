package creational_patterns.Builder.src.com.company;

import java.util.Scanner;

public class PizzaApplication implements IApplication {
    private IPizzaBuilder pizzaBuilder;

    public PizzaApplication() {
        pizzaBuilder = Pizza.builder();
    }

    @Override
    public void Start() {
        System.out.println("Конструктор пиццы: далее вам будет задано несколько вопросов для создания индивидуальной пиццы.");
        stage1();
        stage2();
        stage3();
        stage4();
        stage5();

        System.out.println("Ваша пицца готова");
        var pizza = this.pizzaBuilder.build();
    }

    private void stage1() {
        System.out.println("Вы хотите, чтобы в пицце были ананасы? (y - да, n - нет)");
        Scanner reader = new Scanner(System.in);
        var wishAnswer = reader.nextLine();
        if (wishAnswer.equals("y")) {
            System.out.println("Сколько грамм нужно положить? (напишите число)");
            var amountAnswer = reader.nextInt();
            pizzaBuilder.setPineappleAmount(amountAnswer);
        }
    }

    private void stage2() {
        System.out.println("Вы хотите, чтобы в пицце был сыр? (y - да, n - нет)");
        Scanner reader = new Scanner(System.in);
        var wishAnswer = reader.nextLine();
        if (wishAnswer.equals("y")) {
            System.out.println("Сколько грамм нужно положить? (напишите число)");
            var amountAnswer = reader.nextInt();
            pizzaBuilder.setCheezeAmount(amountAnswer);
        }
    }

    private void stage3() {
        System.out.println("Вы хотите, чтобы в пицце были грибы? (y - да, n - нет)");
        Scanner reader = new Scanner(System.in);
        var wishAnswer = reader.nextLine();
        if (wishAnswer.equals("y")) {
            System.out.println("Сколько грамм нужно положить? (напишите число)");
            var amountAnswer = reader.nextInt();
            pizzaBuilder.setMushroomsAmount(amountAnswer);
        }
    }

    private void stage4() {
        System.out.println("Вы хотите, чтобы в пицце был бекон? (y - да, n - нет)");
        Scanner reader = new Scanner(System.in);
        var wishAnswer = reader.nextLine();
        if (wishAnswer.equals("y")) {
            System.out.println("Сколько грамм нужно положить? (напишите число)");
            var amountAnswer = reader.nextInt();
            pizzaBuilder.setBeaconAmount(amountAnswer);
        }
    }

    private void stage5() {
        System.out.println("Вы хотите, чтобы в пицце были морепродукты? (y - да, n - нет)");
        Scanner reader = new Scanner(System.in);
        var wishAnswer = reader.nextLine();
        if (wishAnswer.equals("y")) {
            System.out.println("Сколько грамм нужно положить? (напишите число)");
            var amountAnswer = reader.nextInt();
            pizzaBuilder.setSeafoodAmount(amountAnswer);
        }
    }
}
