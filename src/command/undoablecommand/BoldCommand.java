package command.undoablecommand;

public class BoldCommand implements UndoableCommand {

    private final HtmlDocument htmlDocument;
    private final History history;
    private String previousContent;

    public BoldCommand(HtmlDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }

    @Override
    public void unexecute() {
        htmlDocument.setContent(previousContent);
    }

    @Override
    public void execute() {
        previousContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        history.push(this);
    }
}
