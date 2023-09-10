package hashmap;

import java.util.HashMap;

public class Task12 {
    //Write a Java program to get a collection
    // view of the values contained in this map
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Black");
        colors.put(4, "White");
        colors.put(5, "Blue");

        System.out.println("Collection view is: " + colors.values());
    }
}
