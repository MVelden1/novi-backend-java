package nl.novi.les2.huiswerk.supermarkt;

import java.util.Objects;

public class Customer {
    private String name;
    private Supermarket supermarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSupermarket(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    public void buyItem(String productName, int amount) {
        if (this.supermarket == null) {
            System.out.println("Select a supermarket to go to first");
            return;
        } else if (Objects.equals(productName, "bread")) {
            supermarket.buyBread(amount);
        } else if (Objects.equals(productName, "fruit")) {
            supermarket.buyFruit(amount);
        } else if (Objects.equals(productName, "cheese")) {
            supermarket.buyCheese(amount);
        } else if (Objects.equals(productName, "toilet paper")) {
            supermarket.buyToiletPaper(amount);
        } else {
            System.out.println("This product is not available.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
