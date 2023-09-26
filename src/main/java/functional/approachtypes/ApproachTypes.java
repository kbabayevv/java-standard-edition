package functional.approachtypes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static functional.approachtypes.Gender.FEMALE;
import static functional.approachtypes.Gender.MALE;

public class ApproachTypes {

    //imperative approach
    public static void getImperativeApproach() {
        List<Person> people = List.of(
                new Person("Kamran", "Babayev", MALE),
                new Person("Nurlan", "Rzayev", MALE),
                new Person("Arzu", "Mirzeyeva", FEMALE)
        );

        List<Person> filteredPerson = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(MALE)) {
                filteredPerson.add(person);
            }
        }

        System.out.println(filteredPerson);
    }

    //Declarative Approach
    public static List<Person> getDeclarativeApproach() {
        List<Person> people = List.of(
                new Person("Kamran", "Babayev", MALE),
                new Person("Nurlan", "Rzayev", MALE),
                new Person("Arzu", "Mirzeyeva", FEMALE)
        );

        return people
                .stream()
                .filter(person -> Gender.MALE.equals(person.getGender()))
                .collect(Collectors.toList());
    }
}
