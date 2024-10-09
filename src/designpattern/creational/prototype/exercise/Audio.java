package designpattern.creational.prototype.exercise;

public class Audio implements Component {

    @Override
    public Component clone() {
        // Logic for creating a new Audio object based
        // on the current instance
        return new Audio();
    }
}
