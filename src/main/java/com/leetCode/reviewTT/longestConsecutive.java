package com.leetCode.reviewTT;

import java.util.HashSet;

public class longestConsecutive {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        if (nums.length == 0)
            return 0;
        int max=1;
        for (int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }

        for (int i:nums){
            int l = i-1;
            int r = i+1;
            int k = 1;
           while (hashSet.contains(l)){
               hashSet.remove(l);
               l--;
               k++;

           }
            while (hashSet.contains(r)){
                hashSet.remove(r);
                r++;
                k++;
            }
            max=Math.max(k,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
