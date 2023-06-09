package test.demo;

/**
 * * 给定一个字符串，反转它
 */
public class inverse {
    public static void main(String[] args) {
        char[] a = {'a','d','w','d','b'};
        char[] inverse = inverse(a);
        for (int i = 0; i < inverse.length; i++) {
            System.out.print(inverse[i]);
        }
    }
    public static char[] inverse(char[] s){
        int left = 0,right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}
