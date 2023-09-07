package collections;

import java.util.ArrayList;

public class Task2 {
    //Write a method that returns the last element of an ArrayList of Strings
    //If there is no last element in the ArrayList, return the empty String "".
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Car");
        products.add("Phone");
        products.add("Tablet");
        products.add("Smart watch");
        products.add("Notebook");

        System.out.println("Last element: " + getLastElement(products));
    }
    public static String getLastElement(ArrayList<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        } else return list.get(list.size()-1);
    }
}
