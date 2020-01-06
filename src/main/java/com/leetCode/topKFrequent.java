package com.leetCode;

import java.util.*;

public class topKFrequent {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) +1);
        }

        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>();
        entryList.addAll(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Integer,Integer> m :entryList){
            if (k-->0){
                result.add(m.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] n = {4,1,-1,2,-1,2,3,2};
        System.out.println(topKFrequent(n,2));
    }
}
