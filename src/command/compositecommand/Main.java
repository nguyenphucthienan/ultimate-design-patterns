package command.compositecommand;

public class Main {

    public static void main(String[] args) {
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new ApplyFilterCommand());
        compositeCommand.execute();
    }
}
