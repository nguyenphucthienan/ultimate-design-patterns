package command.undoablecommand;

public interface UndoableCommand extends Command {

    void unexecute();
}
