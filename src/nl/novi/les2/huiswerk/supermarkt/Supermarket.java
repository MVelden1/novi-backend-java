package nl.novi.les2.huiswerk.supermarkt;

public class Supermarket {
    private final Product bread;
    private final Product fruit;
    private final Product toiletPaper;
    private final Product cheese;

    public Supermarket(Product bread, Product fruit, Product toiletPaper, Product cheese) {
        this.bread = orDefault(bread);
        this.fruit = orDefault(fruit);
        this.toiletPaper = orDefault(toiletPaper);
        this.cheese = orDefault(cheese);
    }

    private static Product orDefault(Product product) {
        if (product == null) {
            return new Product("fake", 0, 0);
        }
        return product;
    }

// Hieronder ook nog wat gerommeld met try/catch
//    public Supermarket(Product bread, Product fruit, Product toiletPaper, Product cheese) {
//        if (bread == null) {
//            throw new IllegalArgumentException("Bread cannot be null");
//        }
//        this.bread = bread;
//        if (fruit == null) {
//            throw new IllegalArgumentException("fruit cannot be null");
//        }
//        this.fruit = fruit;
//        if (toiletPaper == null) {
//            throw new IllegalArgumentException("Toilet paper cannot be null");
//        }
//        this.toiletPaper = toiletPaper;
//        if (cheese == null) {
//            throw new IllegalArgumentException("cheese cannot be null");
//        }
//        this.cheese = cheese;
//    }

    public void buyBread(int amount) {
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount) {
        buyItem(this.fruit, amount);
    }

    public void buyCheese(int amount) {
        buyItem(this.cheese, amount);
    }

    public void buyToiletPaper(int amount) {
        buyItem(this.toiletPaper, amount);
    }

    public void buyItem(Product product, int amount) {
        if (product.getAmount() >= amount) {
            System.out.println("You bought " + amount + " " + product.getName()
                    + " for " + product.getPrice() * amount + " euro.");
            product.setAmount(product.getAmount() - amount);
        } else {
            System.out.println("You cannot buy " + amount + " " + product.getName()
                    + ", we only have " + product.getAmount() + " " + product.getName() + " in stock.");
        }
    }
}
