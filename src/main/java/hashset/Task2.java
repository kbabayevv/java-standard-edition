package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Task2 {
    //Write a Java program to iterate
    // through all elements in a hash list.
    public static void main(String[] args) {
        HashSet<String> products = new HashSet<>();
        products.add("Car");
        products.add("Phone");
        products.add("Notebook");
        products.add("Book");
        products.add("Smart watch");

        Iterator<String> iterator = products.iterator();
        while (iterator.hasNext()) {
            String product = iterator.next();
            System.out.println("Product name: " + product);
        }
    }
}
