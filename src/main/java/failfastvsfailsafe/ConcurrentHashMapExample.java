package failfastvsfailsafe;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> namesAndAges = new ConcurrentHashMap<>();
        namesAndAges.put("Kamran", 24);
        namesAndAges.put("Nurlan", 26);

        Iterator<Map.Entry<String, Integer>> iterator = namesAndAges.entrySet().iterator();
        while (iterator.hasNext()) {
            namesAndAges.put("Orxan", 37);
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : namesAndAges.entrySet()) {
            Map.Entry<String, Integer> entry = stringIntegerEntry;
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
