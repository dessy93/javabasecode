package com.leetCode.reviewTT;

public class maxSubArray {

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for (int i=1;i<nums.length;i++){
            dp[i] = Math.max(nums[i],dp[i-1] + nums[i]);
        }
        for (int i=0;i<nums.length;i++)
            max = max < dp[i] ? dp[i] : max;
        return max;

    }

    public static void main(String[] args) {
        int[] a = {-1};
        System.out.println(maxSubArray(a));
    }
}
