package designpattern.behavioural.command.editor;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HTMLDocument();
        document.setContent("Hello World");

        // Somewhere in our application, this command object is linked with a button or a menu item
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);  // both commands are talking to the same history object
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
