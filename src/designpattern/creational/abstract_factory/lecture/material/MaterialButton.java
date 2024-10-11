package designpattern.creational.abstract_factory.lecture.material;

import designpattern.creational.abstract_factory.lecture.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
