package designpattern.creational.abstract_factory.lecture.app;

import designpattern.creational.abstract_factory.lecture.Theme;
import designpattern.creational.abstract_factory.lecture.Widget;
import designpattern.creational.abstract_factory.lecture.WidgetFactory;
import designpattern.creational.abstract_factory.lecture.ant.AntButton;
import designpattern.creational.abstract_factory.lecture.ant.AntTextBox;
import designpattern.creational.abstract_factory.lecture.material.MaterialButton;
import designpattern.creational.abstract_factory.lecture.material.MaterialTextBox;

public class ContactForm {
//    public void render(Theme theme) {
//        if (theme == Theme.ANT) {
//            new AntTextBox().render();
//            new AntButton().render();
//        }
//        else if (theme == Theme.MATERIAL) {
//            new MaterialTextBox().render();
//            new MaterialButton().render();
//        }
//    }

    public void render(WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
