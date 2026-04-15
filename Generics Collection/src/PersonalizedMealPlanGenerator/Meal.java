package PersonalizedMealPlanGenerator;
class Meal<T extends MealPlan> {
    private T plan;

    public void setMeal(T plan) {
        this.plan = plan;
    }

    public T getMeal() {
        return plan;
    }
}

