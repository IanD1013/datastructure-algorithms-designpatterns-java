package designpattern.creational.abstract_factory.lecture.ant;

import designpattern.creational.abstract_factory.lecture.Button;
import designpattern.creational.abstract_factory.lecture.TextBox;
import designpattern.creational.abstract_factory.lecture.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
