package nl.novi.les1.huiswerk.personalia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Personalia {

    static String name;
    static int age;
    static String email;
    static String address;
    static String phone;
    static double height;
    static double weight;
    static LocalDate birthday;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    static void main() {
        printMenu();
        setName();
        setAge();
        setEmail();
        setAddress();
        setPhone();
        setHeight();
        setWeight();
        setBirthday();

        printProfile();
        IO.println("Afsluiten. Tot ziens!");
    }

    static void printMenu() {
        IO.println("======================================");
        IO.println("Welkom bij de profiel app");
        IO.println("Deze app zal het volgende uitvoeren:");
        IO.println(" 1  - Vul naam in");
        IO.println(" 2  - Vul leeftijd in");
        IO.println(" 3  - Vul email in");
        IO.println(" 4  - Vul adres in");
        IO.println(" 5  - Vul telefoonnummer in");
        IO.println(" 6  - Vul lengte in (cm) in");
        IO.println(" 7  - Vul gewicht in (kg) in");
        IO.println(" 8  - Vul verjardag in");
        IO.println(" 9  - Toon profiel");
    }

    static void printProfile() {
        IO.println();
        IO.println("----- PROFIEL -----");
        IO.println("Naam: " + name);
        IO.println("Leeftijd: " + age);
        IO.println("E-mail: " + email);
        IO.println("Adres: " + address);
        IO.println("telefoonnummer: " + phone);
        IO.println("Lengte: " + height);
        IO.println("Gewicht: " + weight);
        IO.println("Geboortedatum: " + dateFormatter(birthday));
        IO.println("BMI: " + String.format("%.2f", calculateBMI(height, weight)));
        IO.println("-------------------");
    }

    private static double calculateBMI(double height, double weight) {
        height /= 100;
        return weight / (height * height);
    }

    static void setName() {
        IO.print("Voer je volledige naam in: ");
        name = IO.readln().trim();
        IO.println("Naam opgeslagen: " + name);
    }

    static void setAge() {
        IO.print("Voer je leeftijd in: ");
        age = Integer.parseInt(IO.readln().trim());
        IO.println("Leeftijd opgeslagen: " + age);
    }

    static void setEmail() {
        IO.print("Voer je email in: ");
        email = IO.readln().trim();
        IO.println("Email opgeslagen: " + email);
    }

    static void setAddress() {
        IO.print("Voer je adres in: ");
        address = IO.readln().trim();
        IO.println("Adres opgeslagen: " + address);
    }

    static void setPhone() {
        IO.print("Voer je telefoonnummer in: ");
        phone = IO.readln().trim();
        IO.println("telefoonnummer opgeslagen: " + phone);
    }

    static void setHeight() {
        IO.print("Voer je lengte in (cm): ");
        height = Double.parseDouble(IO.readln().trim());
        IO.println("lengte opgeslagen: " + height);
    }

    static void setWeight() {
        IO.print("Voer je gewicht in (kg): ");
        weight = Double.parseDouble(IO.readln().trim());
        IO.println("gewicht opgeslagen: " + weight);
    }

    static void setBirthday() {
        IO.print("Voer je geboortedatum in (dd-mm-jjjj): ");
        birthday = LocalDate.parse(IO.readln().trim(), DATE_FORMAT);
        IO.println("geboortedatum opgeslagen: " + dateFormatter(birthday));
    }

    private static String dateFormatter(LocalDate date) {
        return date.format(DATE_FORMAT);
    }
}
