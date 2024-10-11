package designpattern.creational.abstract_factory.exercise;

/**
 * You are building a weight loss app. Your app currently supports
 * two kinds of goals: Weight Loss and Build Muscle. There's a plan
 * to support other kinds of goals like Strength Training, Getting
 * Active and so on in the near future. Depending on the goal the
 * user selects, they'll see a different meal plan and workout routine.
 */
public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalFactory goalFactory) {
        workoutPlan = goalFactory.createWorkoutPlan();
        mealPlan = goalFactory.createMealPlan();

        System.out.println(workoutPlan);
        System.out.println(mealPlan);
    }
}
