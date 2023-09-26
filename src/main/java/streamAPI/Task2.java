package streamAPI;

import java.util.List;

public class Task2 {
    //Given a list of strings, convert each string to uppercase and print the modified strings.
    public static void main(String[] args) {
        List<String> names = List.of("Kamran", "Nurlan", "Qamet", "Zaur");
        names
                .stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
    }
}
