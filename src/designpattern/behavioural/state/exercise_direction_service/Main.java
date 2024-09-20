package designpattern.behavioural.state.exercise_direction_service;

public class Main {
    public static void main(String[] args) {
        var service = new DirectionService(new Driving());
        service.getEta();
        service.getDirection();
    }
}
