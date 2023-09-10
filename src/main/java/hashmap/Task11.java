package hashmap;

import java.util.HashMap;
import java.util.Set;

public class Task11 {
    //Write a Java program to get a
    // set view of the keys contained in this map
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        Set keyset = hash_map.keySet();
        System.out.println("Key set values: " + keyset);
    }

}
