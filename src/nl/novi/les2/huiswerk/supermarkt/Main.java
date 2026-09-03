package nl.novi.les2.huiswerk.supermarkt;

import java.util.Scanner;

public class Main {
    static void main() {
        Product bread = new Product("bread", 1, 5);
        Product fruit = new Product("fruit", 1.5, 15);
        Product cheese = new Product("cheese", 3, 3);
        Product toiletPaper = new Product("toilet paper", 0.5, 50);

        Supermarket supermarket = new Supermarket(bread, fruit, toiletPaper, cheese);
        Customer customer = new Customer("Pietje");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which product do you want to buy?");
        String productName = scanner.nextLine().trim();
        System.out.println("How many do you want to buy");
        int amount = scanner.nextInt();

        customer.goToSupermarket(supermarket);
        customer.buyItem(productName, amount);

        //om te testen met null waardes
//        Supermarket supermarket2 = new Supermarket(null, null, null, null);
//        customer.goToSupermarket(supermarket2);
//        customer.buyItem(productName, amount);
    }
}
