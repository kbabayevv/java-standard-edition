package hashset;

import java.util.HashSet;

public class Task11 {
    // Write a Java program to compare
    // two sets and retain elements that are the same
    public static void main(String[] args) {
        HashSet<String> colors1 = new HashSet<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");
        colors1.add("White");
        System.out.println("First HashSet content: " + colors1);

        HashSet<String> colors2 = new HashSet<>();
        colors2.add("Red");
        colors2.add("Pink");
        colors2.add("Black");
        colors2.add("Orange");
        System.out.println("Second HashSet content: " + colors2);

        colors1.retainAll(colors2);
        System.out.println("HashSet content:");
        System.out.println(colors1);
    }
}
