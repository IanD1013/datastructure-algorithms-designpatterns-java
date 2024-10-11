package designpattern.creational.abstract_factory.lecture;

import designpattern.creational.abstract_factory.lecture.app.ContactForm;
import designpattern.creational.abstract_factory.lecture.material.MaterialWidgetFactory;
import designpattern.creational.abstract_factory.lecture.ant.AntWidgetFactory;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
        new ContactForm().render(new AntWidgetFactory());
    }
}
