package streamAPI;

import java.util.List;

public class Task4 {
    //Given a list of strings, sort them in alphabetical order and print the sorted list
    public static void main(String[] args) {
        List<String> names = List.of("Ziya", "Yusif", "Hesen", "Eynulla", "Bunyad", "Ali");

        names
                .stream()
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}
