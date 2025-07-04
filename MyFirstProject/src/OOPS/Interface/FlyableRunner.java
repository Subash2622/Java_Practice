package OOPS.Interface;

interface Flyable{
    void fly();
}
class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("With wings");
    }
}

class Aeroplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("With fuel");
    }
}
public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for(Flyable object : flyingObjects){
            object.fly();
        }
    }
}
