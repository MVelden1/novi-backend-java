package nl.novi.les2.lesinhoud.classes.company;

import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lasttName;
    private LocalDate dob;
    private Address address;

    public Employee(String firstName, String lasttName, LocalDate dob) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.dob = dob;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
