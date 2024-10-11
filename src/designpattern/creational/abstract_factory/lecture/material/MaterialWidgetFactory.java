package designpattern.creational.abstract_factory.lecture.material;

import designpattern.creational.abstract_factory.lecture.Button;
import designpattern.creational.abstract_factory.lecture.TextBox;
import designpattern.creational.abstract_factory.lecture.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
