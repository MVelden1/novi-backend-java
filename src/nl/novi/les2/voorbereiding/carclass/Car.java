package nl.novi.les2.voorbereiding.carclass;

public class Car {
    private String brand;
    private String type;
    private int buildYear;
    private String color;
    private double engineSize;


    public Car(String brand, String type, int buildYear, String color, double engineSize) {
        this.brand = brand;
        this.type = type;
        this.buildYear = buildYear;
        this.color = color;
        this.engineSize = engineSize;
    }

    public void CarDescription(String brand, String type, String color) {
        System.out.println("This " + brand + " " + type + " is " + color + ".");
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
