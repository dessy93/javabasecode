package com.leetCode;

/**
 * 盛最多水的容器
 * https://leetcode-cn.com/problems/container-with-most-water/
 */

/**
 * 双指针法
 */
public class maxArea {

    public static int maxArea(int[] height) {
        int h=0,r=height.length-1,max=0;
        while (h < r){
            max = Math.max(max,Math.min(height[h],height[r])*(r-h));
            if (height[h]<height[r]){
                h++;
            }else {
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }


}
