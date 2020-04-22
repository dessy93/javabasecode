package com.leetCode.reviewTT;

import java.util.*;

public class threeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i=0;i<nums.length-2;i++)
            for (int j=i+1;j<nums.length-1;j++)
                for (int k=j+1;k<nums.length;k++){
                    if (nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if (!set.contains(list)){
                            set.add(list);
                            lists.add(list);
                        }
                    }
                }

        return lists;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        for (int i=0;i<nums.length-2;i++)
            for (int j=i+1;j<nums.length-1;j++)
            {
                if (map.containsKey(-nums[i]-nums[j]) && map.get(-nums[i]-nums[j]) != i && map.get(-nums[i]-nums[j]) != j){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-nums[i]-nums[j]);
                    Collections.sort(list);
                    if (!set.contains(list)){
                        lists.add(list);
                        set.add(list);
                    }

                }
            }

        return lists;
    }

    public static void main(String[] args) {

    }
}
