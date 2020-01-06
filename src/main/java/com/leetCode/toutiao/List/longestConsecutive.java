package main.java.com.leetCode.toutiao.List;

import java.util.HashSet;

public class longestConsecutive {

    public static int longestConsecutive(int[] nums) {

        if (nums.length < 1)
            return nums.length;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        int max = 0;
        for (int i : nums){
            int count =1;
            int left = i -1;
            int right = i + 1;

            while (hashSet.contains(left)){
                count ++;
                hashSet.remove(left);
                left --;
            }

            while (hashSet.contains(right)){
                count++;
                hashSet.remove(right);
                right++;
            }

            max = Math.max(max,count);

        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
