package command.compositecommand;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize image");
    }
}
