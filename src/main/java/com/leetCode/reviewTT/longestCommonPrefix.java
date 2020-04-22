package com.leetCode.reviewTT;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length ==0)
            return "";
        String ans = strs[0];
        for (int i=1;i<strs.length;i++){
           while (strs[i].indexOf(ans) != 0){
               ans = ans.substring(0,ans.length()-1);
               if (ans.length() == 0)
                   return "";
           }
        }
        return ans;
    }



    public static void main(String[] args) {
       String[] s = {"flower","flow"};
        System.out.println(longestCommonPrefix(s));
    }
}
