package OOPS;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer", 0.07873, "Red");
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte) 5);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
