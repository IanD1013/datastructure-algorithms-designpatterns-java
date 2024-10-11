package designpattern.creational.abstract_factory.exercise;

public class BuildMuscleFactory implements GoalFactory {
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BuildMuscleWorkout();
    }

    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMealPlan();
    }
}
