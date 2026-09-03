package nl.novi.les2.lesinhoud.classes.address;

public class Address {
    public String street;
    public String city;
    public String zipcode;
    public int number;

    public Address() {
        street = "";
        city = "";
        zipcode = "";
        number = 0;
    }

    public Address(String zipcode, int number) {
        street = "";
        city = "";
        this.zipcode = zipcode;
        this.number = number;
    }

    public void print() {
        System.out.println("Addres: " +
                this.street + " " +
                this.number + ", " +
                this.zipcode + " te " +
                this.city);
    }
}
