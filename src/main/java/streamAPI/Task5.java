package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    //Given a list of strings, count and print
    // the number of strings that have a length greater than 5
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Car", "Phone", "Notebook", "Tablet", "Watch", "TV", "Head Phone");
        long count = products.stream()
                .filter(product -> product.length() > 5)
                .count();
        System.out.println("Count is " + count);
        products.stream()
                .filter(product -> product.length() > 5)
                .forEach(product -> System.out.println(product));
    }
}
