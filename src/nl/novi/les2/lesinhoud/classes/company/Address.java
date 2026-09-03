package nl.novi.les2.lesinhoud.classes.company;

public class Address {
    private int number;
    private String street;
    private String city;
    private String zipcode;

    public Address() {
    }

    public Address(int number, String zipcode) {
        this.zipcode = zipcode;
        this.number = number;
    }

    // copy constructor
    public Address(Address a) {
        this.city = a.city;
        this.zipcode = a.zipcode;
        this.number = a.number;
        this.street = a.street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
