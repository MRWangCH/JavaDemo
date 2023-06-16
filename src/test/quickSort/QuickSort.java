package test.quickSort;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotPos = partition(arr, low, high);  // 划分操作，获取基准元素的位置
            quickSort(arr, low, pivotPos - 1);  // 对基准元素左边的子序列进行快速排序
            quickSort(arr, pivotPos + 1, high);  // 对基准元素右边的子序列进行快速排序
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];  // 选择第一个元素作为基准
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                high--;
            }
            arr[low] = arr[high];  // 将小于基准的元素移到左边

            while (low < high && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];  // 将大于基准的元素移到右边
        }
        arr[low] = pivot;  // 基准元素归位
        return low;  // 返回基准元素的位置
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}