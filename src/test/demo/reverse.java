package test.demo;

public class reverse {

    public static void main(String[] args) {
        boolean result = isPalindrome(12321);
        if (result == true) {
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
    public static boolean isPalindrome(int x) {
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
    }

}
