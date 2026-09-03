package nl.novi.les2.voorbereiding.carclass;

public class Main {
    static void main() {
        Car fiat = new Car("Fiat","500", 2019, "green", 1.4);
        Car toyota = new Car("Toyota","Aygo", 2016, "blue", 1.2);
        Car volvo = new Car("Volvo","CX90", 2022, "black", 2);

        toyota.CarDescription(toyota.getBrand(), toyota.getType(), toyota.getColor());
        fiat.CarDescription(fiat.getBrand(), fiat.getType(), fiat.getColor());
        volvo.CarDescription(volvo.getBrand(), volvo.getType(), volvo.getColor());
    }
}
