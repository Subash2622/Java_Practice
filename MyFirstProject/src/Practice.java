public class Practice {
    String name;
    static String place="India";

    Practice(){
        System.out.println("Default");
    }
    Practice(String name){
        System.out.println("Parameterised");
        this.name=name;
    }

    String sayHi(){
        return "Hi "+this.name;
    }

    static String sayPlace(){
        return "You are from "+place;
    }
}
