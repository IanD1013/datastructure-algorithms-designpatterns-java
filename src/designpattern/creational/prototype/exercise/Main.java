package designpattern.creational.prototype.exercise;

public class Main {
    public static void main(String[] args) {
        var timeline = new Timeline();
        var text = new Text("Hello");
        timeline.add(text);

        var menu = new ContextMenu(timeline);
        menu.duplicate(text);
    }
}
