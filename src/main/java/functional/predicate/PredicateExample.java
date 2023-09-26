package functional.predicate;

import functional.approachtypes.Person;

import java.util.function.Predicate;

import static functional.approachtypes.Gender.MALE;

public class PredicateExample {
    public static void main(String[] args) {
        System.out.println(isEqual(new Person(
                "Kamran",
                "Babayev",
                "+99450-476-86-86",
                MALE)));

        System.out.println(isEqualWithPredicate.test(new Person(
                "Kamran",
                "Babayev",
                "+99450-476-86-86",
                MALE)));
    }

    static Boolean isEqual(Person person) {
        return person.getPhoneNumber().startsWith("+994") && person.getPhoneNumber().length() == 16;
    }

    static Predicate<Person> isEqualWithPredicate =
            person -> person.getPhoneNumber().startsWith("+994") && person.getPhoneNumber().length() == 16;
}
