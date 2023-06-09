package test.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSort {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 18),
                new Person("cok",25),
                new Person("yi",23));

        Comparator<Person> c = Comparator.comparing(Person::getAge);

        people.stream().sorted(c).forEach(System.out::println);
    }
}
