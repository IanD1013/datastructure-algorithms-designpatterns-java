package designpattern.structural.singleton.exercise_logger;

public class Main {
    public static void main(String[] args) {
        var logger1 = Logger.getInstance("file1");
        var logger2 = Logger.getInstance("file1");
        System.out.println(logger1 == logger2);
    }
}
