package designpattern.behavioural.command.editor;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private HTMLDocument document;
    private History history;

    public BoldCommand(HTMLDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);

    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
