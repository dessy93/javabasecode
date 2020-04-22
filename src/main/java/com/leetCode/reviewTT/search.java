package com.leetCode.reviewTT;

public class search {

    public int search(int[] nums, int target){
        if (nums.length == 0 ||(nums.length ==1 && nums[0] != target))
            return -1;
        int i=0,j=nums.length-1;
        while (i<nums.length && nums[i] <= target){
            if (nums[i] == target)
                return i;
            i++;
        }
        while (j>=0 && nums[j] >= target){
            if (nums[j] == target)
                return j;
            j--;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
