package PersonalizedMealPlanGenerator;

public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = new Meal<>();
        MealGenerator.generateMeal(vegMeal, new VegetarianMeal());

        Meal<VeganMeal> veganMeal = new Meal<>();
        MealGenerator.generateMeal(veganMeal, new VeganMeal());

        Meal<KetoMeal> ketoMeal = new Meal<>();
        MealGenerator.generateMeal(ketoMeal, new KetoMeal());

        Meal<HighProteinMeal> proteinMeal = new Meal<>();
        MealGenerator.generateMeal(proteinMeal, new HighProteinMeal());
    }
}