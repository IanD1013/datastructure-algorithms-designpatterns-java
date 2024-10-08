package designpattern.creational.prototype.lecture;

public class ContextMenu {
    public void duplicate(Component component) {
        Component newComponent = component.clone();
        // add target to our document
    }
}
