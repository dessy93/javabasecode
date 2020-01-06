package main.java.com.leetCode.toutiao.String;

import java.util.HashSet;

public class lengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int i=0,j=0;
        HashSet<Character> resultSet = new HashSet<>();
        while (i< s.length() && j<s.length()){
            if (!resultSet.contains(s.charAt(j))){
                resultSet.add(s.charAt(j));
                j++;
                result = (j-i) > result ? (j-i) : result;
            }else {
                resultSet.remove(s.charAt(i++));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ccxycxy77"));
    }
}
