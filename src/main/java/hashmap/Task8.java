package hashmap;

import java.util.HashMap;

public class Task8 {
    //Write a Java program to test if a map
    // contains a mapping for the specified value
    public static void main(String[] args) {
        HashMap<Integer, String> products = new HashMap<>();
        products.put(1, "Phone");
        products.put(2, "Car");
        products.put(3, "Book");
        products.put(4, "Smart watch");
        products.put(5, "Notebook");
        products.put(6, "Tablet");

        System.out.println("The Original map: " + products);
        System.out.println("1. Is value 'Smart watch' exists?");
        if (products.containsValue("Smart watch")) {
            System.out.println("Yes, it contains");
        } else {
            System.out.println("No!");
        }

        System.out.println("2. Is value 'Refrigerator' exists?");
        if (products.containsValue("Refrigerator")) {
            System.out.println("Yes, it contains");
        } else {
            System.out.println("No!");
        }
    }
}
