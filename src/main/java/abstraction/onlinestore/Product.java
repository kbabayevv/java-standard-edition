package abstraction.onlinestore;

public abstract class Product {
    private int productId;
    private String name;
    private double price;

    public abstract void displayDetails();

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
