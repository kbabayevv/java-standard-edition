package abstraction.onlinestore;

public class Main {
    public static void main(String[] args) {
        Product electronic = new ElectronicsProduct(123456, "Samsung A51", 1200, 2);
        electronic.displayDetails();
        Product clothing = new ClothingProduct(456789, "T-Shirt", 15, "XXL");
        clothing.displayDetails();
    }
}
