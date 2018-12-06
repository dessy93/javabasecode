package com.leetCode;

/**
 * 最长回文子串
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 */


/**
 * 动态规划
 * 方程式:
 * 初始条件 dp[i][i] = 1 ,dp[i][i+1] = 1 if s[i] == s[i+1]
 * 转移方程 dp[i][j] = 1 if dp[i+1][j-1] = 1 and s[i] == s[j]
 */
public class longestPalindrome {

    public static String longestPalindrome(String s) {
        if (s.length() == 0)
            return "";
        int len = s.length();
        if (len == 1)
            return s;

        int start = 0;
        int longest = 1;
        int[][] dp = new int[len][len] ;

        for (int i=0;i<len;i++){
            dp[i][i] = 1;
            if (i < len -1){
                if (s.charAt(i) == s.charAt(i+1)){
                    dp[i][i+1] = 1;
                    start = i;
                    longest = 2;
                }

            }
        }

        //注意带等号
        for (int l=3;l<=len;l++){
            for (int i=0;l+i-1 < len;i++){
                int j = l+i-1;
                if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1){
                    dp[i][j] = 1;
                    start = i;
                    longest = l;
                }
            }
        }

        return s.substring(start,start+longest);

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
}
