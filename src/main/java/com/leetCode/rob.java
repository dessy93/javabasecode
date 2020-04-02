package com.leetCode;

/**
 * f(k) = max(f(k-2)+A[i],f(k-1))
 */

public class rob {

    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return 0;
        int[] dp = new int[length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i=2;i<= length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i-1]);
        }
        return dp[length];
    }

    public static int rob1(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return 0;
        if (length == 1)
            return nums[0];
        int[] dp1 = new int[length+1];
        int[] dp2 = new int[length+1];
        dp1[0] = 0;
        dp1[1] = nums[0];

        dp2[0] = 0;
        dp2[1] = 0;
        for (int i=2;i<= length;i++){
            dp1[i] = Math.max(dp1[i-1],dp1[i-2] + nums[i-1]);
            dp2[i] = Math.max(dp2[i-1],dp2[i-2] + nums[i-1]);
        }
        return Math.max(dp1[length-1],dp2[length]);
    }

    public static void main(String[] args) {
        int[] a = {2,3,2};
        System.out.println(rob1(a));
    }


}
