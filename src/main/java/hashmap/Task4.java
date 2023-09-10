package hashmap;

import java.util.HashMap;

public class Task4 {
    //Write a Java program to remove all mappings from a map
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Black");
        colors.put(4, "White");
        colors.put(5, "Blue");
        System.out.println("The Original linked map: " + colors);

        colors.clear();
        System.out.println("The New map: " + colors);
    }
}
