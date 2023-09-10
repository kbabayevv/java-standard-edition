package hashmap;

import java.util.HashMap;

public class Task3 {
    //Write a Java program to copy all mappings
    // from the specified map to another map
    public static void main(String[] args) {
        HashMap<Integer, String> prgLanguage = new HashMap<>();
        prgLanguage.put(0, "Java");
        prgLanguage.put(1, "Python");
        prgLanguage.put(2, "C#");
        prgLanguage.put(3, "C++");
        prgLanguage.put(4, "Javascript");
        System.out.println("Original Hash Map: " + prgLanguage);

        HashMap<Integer, String> copied = new HashMap<>();
        copied.put(5, "React");
        copied.put(6, "PHP");
        copied.putAll(prgLanguage);
        System.out.println("Copied Hash Map: " + copied);


    }
}
