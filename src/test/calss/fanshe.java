package test.calss;

import java.lang.reflect.Field;

public class fanshe {
    public static void main(String[] args) throws Exception {
        String str = "abc";
        Class<? extends String> strClass = str.getClass();
        Field field = strClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(str,new char[] {'1','1','1'});
        System.out.println(str);
    }
}
