package com.leetCode.reviewTT;

public class findLengthOfLCIS {
    public static int findLengthOfLCIS(int[] nums) {
        int j=0,length = nums.length,max = 1,k=1;

        if (nums.length == 0)
            return 0;

        while (j +1 < length){
            if (nums[j] < nums[j+1]){
                j++;
                k++;
                if (j +1 == length){
                    max = Math.max(k,max);
                    break;
                }
            }else {
                j++;
                max = Math.max(k,max);
                k=1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findLengthOfLCIS(nums));
    }
}
