package mediator.observer;

public class Button extends UIControl {

    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        notifyEventHandlers();
    }
}
