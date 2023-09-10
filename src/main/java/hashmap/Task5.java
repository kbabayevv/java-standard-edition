package hashmap;

import java.util.HashMap;

public class Task5 {
    // Write a Java program to check whether a
    // map contains key-value mappings (empty) or not
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Black");
        colors.put(4, "White");
        colors.put(5, "Blue");

        boolean result = colors.isEmpty();
        System.out.println("Is hash map empty: " + result);
        colors.clear();
        result = colors.isEmpty();
        System.out.println("Is hash map empty: " + result);
    }
}
