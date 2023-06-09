package test.demo;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3};
        List list = new ArrayList();
        list.add(12);
        list.add(3);
        list.add(2);
        list.add(10);
        //System.out.println(list.sort(0));
        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }
}
