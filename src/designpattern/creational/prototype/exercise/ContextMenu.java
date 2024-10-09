package designpattern.creational.prototype.exercise;

/**
 * You are building a video editor similar to Adobe Premier.
 * The editor contains a timeline of various types of components
 * such as text, clips, audio, and so on. The user should be
 * able to duplicate any component. The duplicated component
 * should be added to the timeline.
 */

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        var newComponent = component.clone();
        timeline.add(newComponent);
    }
}
