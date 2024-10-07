package designpattern.creational.factory_method.exercise;

public class Main {
    public static void main(String[] args) {
        // Standard scheduler using the Gregorian calendar
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());

        // Arabian scheduler using the Arabian calendar
        var arabianScheduler = new ArabianScheduler();
        arabianScheduler.schedule(new Event());
    }
}
