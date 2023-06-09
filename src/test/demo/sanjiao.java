package test.demo;

public class sanjiao {
    public static void main(String[] args) {
        int k = 2;
        int[] v = new int[k];
        v[0] = v[k - 1] = 1;
        int row = 4;
        for (int i = 1; i < row; i++) {
            int[] arr = new int[i];
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    arr[j] = 1;
                } else {
                    arr[j] = v[j - 1] + v[j];
                }
            }
            k++;
            v = new int[k];
            for (int b = 1; b < row - i; b++) {
                System.out.print(" ");
            }
            for (int a = 0; a < arr.length; a++) {
                v[a] = arr[a];
                System.out.print(v[a] + " ");
            }
            System.out.println();
        }
    }
}
