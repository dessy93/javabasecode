package com.leetCode;

public class missingNumber {

    public static int missingNumber(int[] nums) {
        int sum = (0 + nums.length+1)*nums.length/2;
        int z = 0;
        for (int i=0;i<nums.length;i++){
            z += nums[i];
        }

        return sum - z;
    }

    public static void main(String[] args) {
        int[] z = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(z));
    }

}
