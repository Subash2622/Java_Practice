package OOPS;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("line1","Bangalore","758023");
        Customer customer = new Customer("Subash",homeAddress);

        Address workAddress = new Address("line1 for work","Hydrabad","500825");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
