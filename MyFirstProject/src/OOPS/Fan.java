package OOPS;

public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }
    //isOn
//    public void isOn(boolean isOn){
//        this.isOn = isOn;
//    }
    public void switchOn(){
        this.isOn = true;
    }
    public void switchOff(){
        this.isOn = false;
        setSpeed((byte) 0);
    }
    public void setSpeed(byte speed){
        if (isOn) {
            this.speed = speed;
        } else {
            System.out.println("Cannot set speed. Fan is OFF.");
        }
    }
    //Print the state
    @Override
    public String toString() {
        return String.format("make - %s radius - %.2f color - %s isOn - %b speed - %d",
                make, radius, color, isOn, speed);
    }
}
