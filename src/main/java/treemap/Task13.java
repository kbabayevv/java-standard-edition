package treemap;

import java.util.TreeMap;

public class Task13 {
    //Write a Java program to get the portion of a
    // map whose keys are strictly less than a given key
    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");

        System.out.println("Original TreeMap content: " + tree_map);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + tree_map.headMap(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Key(s): " + tree_map.headMap(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + tree_map.headMap(70));
    }
}
