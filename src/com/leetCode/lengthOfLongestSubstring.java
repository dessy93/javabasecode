package com.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 *
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */


public class lengthOfLongestSubstring {

    /**
     * 类似滑动窗口思想
     */

    public static int lengthOfLongestSubstring(String s) {
        int result = 0,i = 0, j = 0;
        int n = s.length();
        Set<Character> wordSet = new HashSet<>();
        while (i < n && j < n){
            if (!wordSet.contains(s.charAt(j))){
                wordSet.add(s.charAt(j++));
                result = Math.max(result,j-i);
            }else {
                wordSet.remove(s.charAt(i++));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cxycxy66";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
