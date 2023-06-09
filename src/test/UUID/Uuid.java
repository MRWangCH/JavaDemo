package test.UUID;

import java.util.Date;
import java.util.UUID;

public class Uuid {
    public static void main(String[] args) {
        String s = UUID.randomUUID().toString();
        System.out.println(s);

        Date date = new Date(System.currentTimeMillis());
        String s1 = date.toString();
        String s2 = String.valueOf(date);
        System.out.println(s2);
        System.out.println(s1.substring(11, 20));
    }
}
