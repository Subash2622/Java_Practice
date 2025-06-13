package OOPS.Inheritance;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public Person(){
        System.out.println("Person Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return String.format("Name: %s, Email: %s", name, email);
    }
}
