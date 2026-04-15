package PersonalizedMealPlanGenerator;

class MealGenerator {

    public static <T extends MealPlan> void generateMeal(Meal<T> meal, T plan) {
        meal.setMeal(plan);
        System.out.println(plan);
    }
}