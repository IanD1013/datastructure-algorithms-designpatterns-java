package designpattern.creational.prototype.exercise;

public class Clip implements Component {

    @Override
    public Component clone() {
        // Logic for creating a new Clip object based
        // on the current instance
        return new Clip();
    }
}
