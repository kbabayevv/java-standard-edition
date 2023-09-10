package hashmap;

import java.util.HashMap;
import java.util.Set;

public class Task9 {
    //Write a Java program to create a
    // set view of the mappings contained in a map
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        Set set = hash_map.entrySet();
        System.out.println("Set values: " + set);
    }
}
