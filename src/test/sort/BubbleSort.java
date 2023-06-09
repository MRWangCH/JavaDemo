package test.sort;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 6, 2, 7, 3};
        myBubblesort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void myBubblesort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp;
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}