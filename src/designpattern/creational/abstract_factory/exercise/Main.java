package designpattern.creational.abstract_factory.exercise;

public class Main {
    public static void main(String[] args) {
        var homePage = new HomePage();
        homePage.setGoal(new WeightLossFactory());
    }
}
