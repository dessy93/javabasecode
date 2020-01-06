package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class intersect {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<Integer>(nums1.length);
        List<Integer> list2 = new ArrayList<Integer>(nums2.length);
        for (int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++){
            list2.add(nums2[i]);
        }
        int[] result = new int[Math.max(nums1.length,nums2.length)];
        int k=0;
        for (Integer i : list2){
            if (list1.contains(i)){
                list1.remove(i);
                result[k] = i;
                k++;
            }
        }
        int[] r = new int[k];
        r = Arrays.copyOf(result,k);
        return r;
    }

    public static void main(String[] args) {
        int[] l1 = {4,9,5};
        int[] l2 = {9,4,9,8,4};
        System.out.println(intersect(l1,l2));
    }

}
