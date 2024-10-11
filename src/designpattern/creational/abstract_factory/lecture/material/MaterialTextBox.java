package designpattern.creational.abstract_factory.lecture.material;

import designpattern.creational.abstract_factory.lecture.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
