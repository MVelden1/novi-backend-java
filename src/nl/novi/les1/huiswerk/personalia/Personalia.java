package nl.novi.les1.huiswerk.personalia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Personalia {

    private static String name;
    private static int age;
    private static String email;
    private static String address;
    private static String phone;
    private static double height;
    private static double weight;
    private static LocalDate birthday;
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

    private static void printMenu() {
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
        IO.println(" 8  - Vul verjaardag in");
        IO.println(" 9  - Toon profiel");
    }

    private static void printProfile() {
        IO.println();
        IO.println("----- PROFIEL -----");
        IO.println("Naam: " + name);
        IO.println("Leeftijd: " + age);
        IO.println("E-mail: " + email);
        IO.println("Adres: " + address);
        IO.println("Telefoonnummer: " + phone);
        IO.println("Lengte: " + height + " cm");
        IO.println("Gewicht: " + weight + " kg");
        IO.println("Geboortedatum: " + formatDate(birthday));
        IO.println("BMI: " + String.format("%.2f", calculateBMI(height, weight)));
        IO.println("-------------------");
    }

    private static double calculateBMI(double heightInCm, double weightInKg) {
        double heightInMeters = heightInCm / 100;
        return weightInKg / (heightInMeters * heightInMeters);
    }

    private static void setName() {
        IO.print("Voer je volledige naam in: ");
        name = IO.readln().trim();
        IO.println("Naam opgeslagen: " + name);
    }

    private static void setAge() {
        IO.print("Voer je leeftijd in: ");
        age = Integer.parseInt(IO.readln().trim());
        IO.println("Leeftijd opgeslagen: " + age);
    }

    private static void setEmail() {
        IO.print("Voer je email in: ");
        email = IO.readln().trim();
        IO.println("Email opgeslagen: " + email);
    }

    private static void setAddress() {
        IO.print("Voer je adres in: ");
        address = IO.readln().trim();
        IO.println("Adres opgeslagen: " + address);
    }

    private static void setPhone() {
        IO.print("Voer je telefoonnummer in: ");
        phone = IO.readln().trim();
        IO.println("Telefoonnummer opgeslagen: " + phone);
    }

    private static void setHeight() {
        IO.print("Voer je lengte in (cm): ");
        height = Double.parseDouble(IO.readln().trim());
        IO.println("Lengte opgeslagen: " + height + " cm");
    }

    private static void setWeight() {
        IO.print("Voer je gewicht in (kg): ");
        weight = Double.parseDouble(IO.readln().trim());
        IO.println("Gewicht opgeslagen: " + weight + " kg");
    }

    private static void setBirthday() {
        IO.print("Voer je geboortedatum in (dd-mm-jjjj): ");
        birthday = LocalDate.parse(IO.readln().trim(), DATE_FORMAT);
        IO.println("Geboortedatum opgeslagen: " + formatDate(birthday));
    }

    private static String formatDate(LocalDate date) {
        return date.format(DATE_FORMAT);
    }
}
