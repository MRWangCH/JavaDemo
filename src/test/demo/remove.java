package test.demo;

public class remove {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 11, 15};
        int[] ints = twoSum(a, 13);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
