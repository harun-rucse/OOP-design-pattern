package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        System.out.println("Veg Meal:");
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        System.out.println("\nNon-Veg Meal:");
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
