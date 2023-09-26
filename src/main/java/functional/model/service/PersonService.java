package functional.model.service;

import functional.model.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static functional.model.properties.ApplicationConstant.persons;

public class PersonService {

    public Consumer<Person> createPerson = person -> persons.add(person);
    public Supplier<List<Person>> getAllPersons = () -> persons;

    public Function<Long, List<Person>> getPersonById = id -> persons.stream()
            .filter(person -> id.equals(person.getId())).collect(Collectors.toList());

    public Consumer<Long> deletePersonById = id -> {
        Person foundedPerson = persons
                .stream()
                .filter(person -> id.equals(person.getId())).findFirst().get();
        persons.remove(foundedPerson);
    };
}
