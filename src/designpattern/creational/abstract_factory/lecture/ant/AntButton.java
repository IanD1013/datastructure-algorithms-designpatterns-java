package designpattern.creational.abstract_factory.lecture.ant;

import designpattern.creational.abstract_factory.lecture.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
