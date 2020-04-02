package com.leetCode.test;

public class numSubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            int z = nums[i];
            if (z < k)
            for (int j=i;j<nums.length;j++){
                if (j==i){
                    count++;
                    continue;
                }
                else
                    z *= nums[j];
                if (z < k){
                    count++;
                }else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        System.out.println(numSubarrayProductLessThanK(a,19));
    }
}
