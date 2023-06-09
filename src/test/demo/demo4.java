package test.demo;

public class demo4 {
    public static void main(String[] args) {
        int[] ints = printNumbers(5);
    }

    public static int[] printNumbers(int n) {
        int end = (int) Math.pow(10, n) - 1;
        int[] res = new int[end];
        for (int i = 0; i < end; i++)
            res[i] = i + 1;
        return res;
    }

}
