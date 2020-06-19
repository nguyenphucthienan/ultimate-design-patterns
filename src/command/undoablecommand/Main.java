package command.undoablecommand;

public class Main {

    public static void main(String[] args) {
        History history = new History();
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.setContent("Hello World");

        UndoableCommand boldCommand = new BoldCommand(htmlDocument, history);
        boldCommand.execute();
        System.out.println(htmlDocument.getContent());

        Command undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(htmlDocument.getContent());
    }
}
