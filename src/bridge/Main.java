package bridge;

public class Main {

    public static void main(String[] args) {
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.turnOn();
        advancedRemoteControl.setChannel(1);
        advancedRemoteControl.turnOff();
    }
}
