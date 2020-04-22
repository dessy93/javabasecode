package com.leetCode.reviewTT;

import java.util.HashSet;

public class lengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> hashSet = new HashSet<>();
        int maxLength=0,i=0,j=0;

        while (i<s.length() && j<s.length()){
            if (!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                maxLength = maxLength > (j-i) ? maxLength : (j-i);
            }else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
    return maxLength;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
