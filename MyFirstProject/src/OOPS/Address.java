package OOPS;

public class Address {
    private String line1;
    private String line2;
    private String zip;

    //Creation

    public Address(String line1, String line2, String zip) {
        super();
        this.line1 = line1;
        this.line2 = line2;
        this.zip = zip;
    }

    public String toString(){
        return line1 + " " + line2 + " " + zip;
    }
}
