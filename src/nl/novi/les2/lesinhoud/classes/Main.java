package nl.novi.les2.lesinhoud.classes;

import nl.novi.les2.lesinhoud.classes.company.Address;
import nl.novi.les2.lesinhoud.classes.company.Employee;

import java.time.LocalDate;

public class Main {

    static void main() {
        Address a1 = new Address();
        Address a2 = new Address(123, "1900AB");

        System.out.println("a2 = " + a2);

        a2.setCity("Zaandam");
        System.out.println("a2.getCity() = " + a2.getCity());

        Address a3 = new Address(a2);
        a3.setCity("Amsterdam");
        System.out.println("a2.getCity() = " + a2.getCity());

        Employee e1 = new Employee("John", "Doe",
                LocalDate.of(1975, 12, 25));
        e1.setAddress(a3);

        System.out.println("e1 = " + e1);
    }
}
