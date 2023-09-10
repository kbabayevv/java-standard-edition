package hashset;

import java.util.HashSet;

public class Task3 {
    //Write a Java program to get
    // the number of elements in a hash set.
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println("Original Hash Set: " + colors);
        System.out.println("Size of the Hash Set: " + colors.size());
    }
}
