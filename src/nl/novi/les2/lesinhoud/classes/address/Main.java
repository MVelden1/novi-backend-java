package nl.novi.les2.lesinhoud.classes.address;

public class Main {
    static void main() {
        Address noviUtrecht = new Address();
        Address noviMaastricht = new Address();
        Address noviHaarlem = new Address("3333 cc", 33);

        noviUtrecht.city = "Utrecht";
        noviUtrecht.number = 2;
        noviUtrecht.street = "Newtonlaan";
        noviUtrecht.zipcode = "1111 aa";

        noviMaastricht.city = "Maastricht";
        noviMaastricht.number = 22;
        noviMaastricht.street = "Isaaclaan";
        noviMaastricht.zipcode = "2222 bb";

        noviHaarlem.city = "Haarlem";
        noviHaarlem.street = "Haarlemse straat";

        noviUtrecht.print();
        noviMaastricht.print();
        noviHaarlem.print();
    }
}
