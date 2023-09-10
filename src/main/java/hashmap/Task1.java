package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Task1 {
    //Write a Java program to associate the
    // specified value with the specified key in a HashMap
    public static void main(String[] args) {
        HashMap<String, User> user = new HashMap<>();
        user.put("123asdf", new User("Kamran", "Babayev", 24));
        user.put("321fgde", new User("Nurlan", "Rzayev", 26));
        user.put("789wedf", new User("Orxan", "Rehimov", 37));
        user.put("987qlcg", new User("Serxan", "Huseynov", 35));

        Iterator<Entry<String, User>> iterator = user.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, User> entry = iterator.next();
            String key = entry.getKey();
            User value = entry.getValue();
            System.out.println("finCode: " + key + ", User: " + value);
        }
    }
}

class User {
    private String name;
    private String surname;
    private Integer age;

    public User(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name = " + name +
                " surname = " + surname +
                " age = " + age;
    }
}