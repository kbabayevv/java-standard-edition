package collections;

import java.util.ArrayList;

public class Task3 {
    //Write a method that takes a single ArrayList<Double>
    // as a parameter and returns the sum of all elements in the ArrayList.
    public static void main(String[] args) {
        ArrayList<Double> salary = new ArrayList<>();
        salary.add(1500.0);
        salary.add(900.0);
        salary.add(600.0);
        salary.add(500.0);

        System.out.println("Sum of all elements " + sumOfAllElements(salary));
    }

    public static Double sumOfAllElements(ArrayList<Double> list) {
        Double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
