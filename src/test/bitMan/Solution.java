package test.bitMan;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangchuan
 * @Date: 2023/07/13/16:02
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {

        int[] nums = {1,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int single=0;
        for(int num:nums){
            single ^=num;
        }
        return single;
    }
}
