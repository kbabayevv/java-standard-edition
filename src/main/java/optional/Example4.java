package optional;

import java.util.Optional;

public class Example4 {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index
        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();//Optional.empty
        System.out.println(empty);
        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[5]);
        // If value is present, it returns an Optional otherwise returns an empty Optional
        System.out.println("Filtered value: "+value.filter((s)->s.equals("Abc")));//Filtered value: Optional.empty
        System.out.println("Filtered value: "+value.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));//Filtered value: Optional[JAVA OPTIONAL CLASS EXAMPLE]
        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException
        System.out.println("Getting value: "+value.get());//Getting value: JAVA OPTIONAL CLASS EXAMPLE
        // It returns hashCode of the value
        System.out.println("Getting hashCode: "+value.hashCode());//Getting hashCode: -619947648
        // It returns true if value is present, otherwise false
        System.out.println("Is value present: "+value.isPresent());//Is value present: true
        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
        System.out.println("Nullable Optional: "+Optional.ofNullable(str[5]));//Nullable Optional: Optional[JAVA OPTIONAL CLASS EXAMPLE]
        // It returns value if available, otherwise returns specified value,
        System.out.println("orElse: "+value.orElse("Value is not present"));//orElse: JAVA OPTIONAL CLASS EXAMPLE
        System.out.println("orElse: "+empty.orElse("Value is not present"));//orElse: Value is not present
        value.ifPresent(System.out::println);   //JAVA OPTIONAL CLASS EXAMPLE
    }
}
