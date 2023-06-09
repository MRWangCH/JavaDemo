package test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("12","qq","","qddfa","","123");
        strings.stream().filter(str -> !str.isEmpty()).forEach(System.out::println);

        Long count = strings.stream().filter(str -> str.isEmpty()).count();
        System.out.println(count);

        Long num = strings.stream().filter(s -> s.length() == 3).count();
        System.out.println(num);

        String s = strings.stream().filter(so -> !so.isEmpty()).collect(Collectors.joining("-"));
        System.out.println(s);


        List<Integer> numbers = Arrays.asList(9,2,4,5,7,4,8);
        List<Integer> integers = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(integers);
        System.out.println(numbers.stream().sorted().distinct().collect(Collectors.toList()));


        List<String> collect = strings.stream().filter(b -> b.length() > 2).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));
    }
}
