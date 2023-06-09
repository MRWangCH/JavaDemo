package test.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestMethod {
    public static void main(String[] args) {
        String[] array = {"aa","bb","cc","dd"};
        List<String> list  = Arrays.asList(array);
        list.forEach(TestMethod::print);

        HashMap<String,String> map = new HashMap<>();
        map.put("aa", "bb");
        map.put("cc", "dd");
        map.forEach(TestMethod::print1);
    }

    private static void print1(String s, String s1) {
        System.out.println("k=" + s + ",v="+ s1);
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
