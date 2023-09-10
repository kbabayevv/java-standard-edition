package hashset;

import java.util.HashSet;

public class Task6 {
    //Write a Java program to clone
    // a hash set to another hash set
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Gray");
        colors.add("Black");

        System.out.println("Original Hash Set: " + colors);

        HashSet<String> cloned = (HashSet<String>) colors.clone();
        System.out.println("Cloned Hash Set: " + cloned);


    }
}
