package functional.model;

import functional.model.service.PersonService;

import static functional.model.Gender.MALE;

public class Main {
    static PersonService personService = new PersonService();

    public static void main(String[] args) {
        personService.createPerson.accept(new Person(
                1L,
                "Kamran",
                "Babayev",
                MALE, "+99455 955-55-85"));
        personService.createPerson.accept(new Person(
                2L,
                "Nurlan",
                "Babayev",
                MALE, "+99455 955-55-85"));
        System.out.println(personService.getAllPersons.get());
        System.out.println(personService.getPersonById.apply(1L));
        personService.deletePersonById.accept(1L);
        System.out.println(personService.getAllPersons.get());
    }
}
