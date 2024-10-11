package designpattern.creational.abstract_factory.exercise;

public interface GoalFactory {
    WorkoutPlan createWorkoutPlan();
    MealPlan createMealPlan();
}
