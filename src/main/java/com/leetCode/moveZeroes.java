package com.leetCode;

import java.util.Arrays;

public class moveZeroes {

    public static void moveZeroes(int[] nums) {
        int k=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != 0){
                nums[k++] = nums[i];
            }
        }

        while (k < nums.length){
            nums[k++] = 0;
        }


        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] c = {0,1,0,3,12};
        moveZeroes(c);
    }
}
