package test.demo;

import java.util.Scanner;

/**
 * 判断一个字符串是不是回文串*
 * 双指针，寻找回文串是从中间向两端扩展，判断回文串是从两端向中间收缩*
 * 一左一右两指针相向而行，每走一步判断一次*
 */
public class test2 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean result = isPalindrome(s);
        if (result == true) {
            System.out.println(s + "是回文串");
        } else {
            System.out.println(s + "不是回文串");
        }
    }

    public static boolean isPalindrome(String s) {
        // 一左一右两个指针相向而行
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
