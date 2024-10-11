package designpattern.creational.abstract_factory.lecture.ant;

import designpattern.creational.abstract_factory.lecture.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
