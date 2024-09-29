package designpattern.behavioural.mediator.exercise_signup_dialog_box;

public class TextBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }

    public boolean isEmpty() {
        return content == null || content.isEmpty();
    }
}
