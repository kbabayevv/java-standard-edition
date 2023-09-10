package hashset;

import java.util.HashSet;

public class Task10 {
    //Write a Java program to compare two hash set
    public static void main(String[] args) {
        HashSet<String> colors1 = new HashSet<>();
        colors1.add("Red");
        colors1.add("Blue");
        colors1.add("Green");
        colors1.add("Gray");
        colors1.add("Black");

        HashSet<String> colors2 = new HashSet<>();
        colors2.add("Blue");
        colors2.add("Green");
        colors2.add("Gray");

        for (String element : colors1) {
            System.out.println(colors2.contains(element) ? "Yes" : "No");
        }
    }
}
