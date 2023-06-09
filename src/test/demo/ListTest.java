package test.demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("hello");
            list.add("world");
            for (String l: list) {
                System.out.println(l);
            }
            for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
                String s = it.next();
                System.out.println(s);
            }

            String s1 = "123";
            Integer integer = Integer.valueOf(s1);
            System.out.println(integer);
            String s2 = "汪川";
            System.out.println(s2.hashCode());
        }
}
