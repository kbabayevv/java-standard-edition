package functional.consumer;

import functional.approachtypes.Person;

import java.util.function.BiConsumer;

import static functional.approachtypes.Gender.MALE;

public class BiConsumerExample {
    public static void main(String[] args) {
        System.out.println(getPersonInfo(
                new Person(
                        "Kamran",
                        "Babayev",
                        "050-476-86-86",
                        MALE),
                true));

        getPersonInfoWithBiConsumer.accept(new Person(
                "Kamran",
                "Babayev",
                "050-476-86-86",
                MALE), true);

    }

    static String getPersonInfo(Person person, boolean isResult) {
        if (isResult) {
            return person.getName() + " " + person.getPhoneNumber();
        } else return person.getName() + " " + "***-***-**-**";
    }

    static BiConsumer<Person, Boolean> getPersonInfoWithBiConsumer =
            (person, isResult) -> System.out.println(person.getName() + " " + (isResult ? person.getPhoneNumber() : "***-***-**-**"));


}
