package OOPS;

public class Customer {
    //State
    private String name;
    private Address homeAddress;
    private Address workAddress;

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString(){
        return String.format("name - [%s] home address - [%s] work address - [%s]", name, homeAddress,workAddress );
    }

    //Creating
    public Customer(String name, Address homeAddress){
        this.name=name;
        this.homeAddress=homeAddress;
    }
    //Operators

}
