package com.leetCode.toutiao.listAndTree;

/**
 *列出状态方程即可
 * dp[i] = max(dp[i-1] + num[i] , num[i])
 */

public class maxSubArray {

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] =nums[0];
        for (int i=1;i<nums.length;i++){
            dp[i] = Math.max((dp[i-1]) + nums[i],nums[i]);
        }
        int k = dp[0];
        for (int i=1;i<nums.length;i++){
            if (k<dp[i])
                k = dp[i];
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        System.out.printf(maxSubArray(nums)+"");
    }
}