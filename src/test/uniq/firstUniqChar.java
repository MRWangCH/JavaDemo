package test.uniq;

import java.util.HashMap;
import java.util.Map;

public class firstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("wusuodiaowei"));
    }
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
