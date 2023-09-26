package functional.consumer;

import functional.approachtypes.Person;

import java.util.function.Consumer;

import static functional.approachtypes.Gender.MALE;

public class ConsumerExample {
    public static void main(String[] args) {
        System.out.println(getPerson(new Person("Kamran", "Babayev", MALE)));
        getPersonNameWithConsumer.andThen(getPersonSurnameWithConsumer)
                .accept(new Person("Kamran", " Babayev", MALE));
    }

    static String getPerson(Person person) {
        return person.getName() + " " + person.getSurname();
    }

    static Consumer<Person> getPersonNameWithConsumer =
            person -> System.out.print(person.getName());
    static Consumer<Person> getPersonSurnameWithConsumer =
            person -> System.out.print(person.getSurname());
}
