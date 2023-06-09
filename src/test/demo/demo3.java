package test.demo;

import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Boolean result = map.isEmpty();
        if (result) {
            System.out.println("为空");
        }
        map.put("1", "一");
        map.put("2", "二");
        map.put("3", "三");
        System.out.println(map.isEmpty());
        List<Map<String, String>> list = new ArrayList<>();
        list.add(map);

        Iterator<Map<String, String>> it = list.iterator();
        System.out.println(it.next());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
