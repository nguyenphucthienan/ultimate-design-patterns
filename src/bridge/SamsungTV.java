package bridge;

public class SamsungTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("Samsung: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: turnOff");
    }

    @Override
    public void setChanel(int number) {
        System.out.println("Samsung: setChanel");
    }
}
