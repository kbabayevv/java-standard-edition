package hashmap;

import java.util.HashMap;

public class Task7 {
    //Write a Java program to test if a map
    // contains a mapping for the specified key
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Phone", 1);
        products.put("Car", 2);
        products.put("Book", 3);
        products.put("Smart watch", 4);
        products.put("Notebook", 5);
        products.put("Tablet", 6);

        System.out.println("The Original map: " + products);
        System.out.println("1. Is key 'Book' exists?");
        if (products.containsKey("Book")) {
            System.out.println("yes! - " + products.get("Book"));
        } else {
            System.out.println("no!");
        }

        System.out.println("2. Is key 'TV' exists?");
        if (products.containsKey("TV")) {
            System.out.println("yes! - " + products.get("TV"));
        } else {
            System.out.println("no!");
        }
    }
}
