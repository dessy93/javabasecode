package com.leetCode;

public class singleNumber {

    public static int singleNumber(int[] nums) {
        int ans = nums[0];

        for (int i=1;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,1,3,2,2};
        System.out.println(singleNumber(a));
    }
}
