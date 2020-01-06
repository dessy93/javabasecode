package com.leetCode;


import java.util.Arrays;
import java.util.Collections;

/**
 * 寻找两个有序数组的中位数
 *
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 */


public class findMedianSortedArrays {

    /**
     * 先合并在，再排序
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] total = new int[nums1.length + nums2.length];

        /**
         * System.arraycopy() 在拷贝数组的时候,采用的使用潜复制,复制结果是一维的引用变量传递给副本的一维数组
         */
        System.arraycopy(nums1,0,total,0,nums1.length);
        System.arraycopy(nums2,0,total,nums1.length,nums2.length);

        /**
         * Dual-Pivot Quicksort 快排方法
         * 复杂度O(n log(n))
         */
        Arrays.sort(total);

        /**
         * 判断中位数是中间一位还是两位
         */
        if (total.length % 2 == 0){
            return ((double)total[total.length / 2] + (double) total[total.length / 2 -1])/2.0;
        }else {
            return (double)total[total.length / 2];
        }
    }

    public static void main(String[] args) {
        int a[]={1,2};
        int b[]={3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
