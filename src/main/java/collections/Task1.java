package collections;

import java.util.ArrayList;

public class Task1 {
    //Write a method that returns the first element of an ArrayList of Strings
    //If there is no first element in the ArrayList, return the empty String "".
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Car");
        products.add("Phone");
        products.add("Tablet");
        products.add("Smart watch");
        products.add("Notebook");

        System.out.println("First element: " + getFirstElement(products));
    }

    public static String getFirstElement(ArrayList<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        } else return list.get(0);
    }
}
