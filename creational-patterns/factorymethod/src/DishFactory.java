import java.util.List;

public class DishFactory {

    public static Dish Create(String dishName) {
        if (dishName.equalsIgnoreCase("casserole")) {
            var potatos = List.of(
                    new Potato(), new Potato(), new Potato(), new Potato());
            var meat = new Meat();
            return new Casserole(potatos, meat);
        } else if (dishName.equals("omelet")) {
            List<Egg> eggs = List.of(new Egg(), new Egg());
            Butter butter = new Butter();
            SunFlowerOil oil = new SunFlowerOil();
            return new Omelet(eggs, butter, oil);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
