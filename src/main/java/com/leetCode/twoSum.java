package com.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Dessy
 * @Date: 18-11-24
 * @Desc:给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的 两个 整数
 * https://leetcode-cn.com/problems/two-sum/
 */
public class twoSum {

    /**
     *  暴力遍历
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if ((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    /**
     * 利用hash降低复杂度
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumHash(int[] nums, int target){
        Map<Integer,Integer> hashMap = new HashMap();
        for (int i=0;i<nums.length;i++){

            int value = target - nums[i];
            if (hashMap.containsKey(value) && hashMap.get(value) != i){
                return new int[]{hashMap.get(value),i};
            }

            hashMap.put(nums[i],i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] sum = {3,2,3};
//        int[] result = twoSum(sum,6);
        int[] result = twoSumHash(sum,6);
        System.out.println(result[0] + " " + result[1]);

    }
}
