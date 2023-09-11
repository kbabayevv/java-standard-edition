package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    //Create a HashSet of strings and iterate through its elements using an iterator.
    //Use a for-each loop to iterate through the HashSet.
    public static void main(String[] args) {
        HashSet<String> products = new HashSet<>();
        products.add("Car");
        products.add("Phone");
        products.add("Notebook");
        products.add("Tablet");
        products.add("TV");
        products.add("Smart watch");

        System.out.println("With Iterator");
        Iterator<String> iterator = products.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Product name: " + element);
        }

        System.out.println("With for-each loop");
        for (String product : products) {
            System.out.println("Element: " + product);
        }
    }
}
