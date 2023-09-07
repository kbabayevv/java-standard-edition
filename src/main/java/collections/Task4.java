package collections;

import java.util.ArrayList;

public class Task4 {
    //Write a method that takes two parameters, an
    // ArrayList of Doubles and a double value and
    // return the ArrayList with each element multiplied by value
    //For example, if we had an ArrayList<Double> list with the values [1.0, 2.0, 3.0]:
    public static void main(String[] args) {
        ArrayList<Double> count = new ArrayList<>();
        count.add(5.5);
        count.add(3.5);
        count.add(7.5);
        count.add(9.5);

        System.out.println("Original Array List: " + count);

        System.out.println("After multiplied by value 2");
        System.out.println("New Array List: " + multipliedByValue(count, 2));

    }

    public static ArrayList<Double> multipliedByValue(ArrayList<Double> list, double value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value * list.get(i));
        }
        return list;
    }
}
