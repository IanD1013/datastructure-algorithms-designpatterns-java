package designpattern.behavioural.mediator;

public class UIControl {
    protected DialogBox owner; // every UI control has its owner

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
