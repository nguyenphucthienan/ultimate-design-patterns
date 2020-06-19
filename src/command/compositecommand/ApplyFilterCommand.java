package command.compositecommand;

public class ApplyFilterCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Apply filter to image");
    }
}
