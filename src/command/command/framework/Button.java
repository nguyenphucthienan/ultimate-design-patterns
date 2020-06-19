package command.command.framework;

public class Button {

    private final Command command;
    private String label;

    public Button(Command command) {
        this.command = command;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void click() {
        command.execute();
    }
}
