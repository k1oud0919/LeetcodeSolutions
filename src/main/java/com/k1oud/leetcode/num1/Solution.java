package com.k1oud.leetcode.num1;

import java.util.Arrays;

/**
 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]

 */
class Solution {

    public int[] twoSum(int[] nums, int target) {
        int targetArray []= new int[2];
        int leftIndex;
        int rightIndex ;
        for ( leftIndex = 0; leftIndex < nums.length-1 ; leftIndex++) {
            for (rightIndex = leftIndex+1; rightIndex <nums.length ; rightIndex++) {
                if(target == nums[leftIndex]+nums[rightIndex]){
                    targetArray[0]=leftIndex;
                    targetArray[1]=rightIndex;
                    return targetArray;
                }
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        int nums []= {2,7,11,15};
        //int [] a  = new int[2];
        //new Solution().twoSum(nums, 9);
        //Arrays.toString( new Solution().twoSum(nums, 9));
        System.out.println(Arrays.toString(new Solution().twoSum(nums, 9)));
    }
}