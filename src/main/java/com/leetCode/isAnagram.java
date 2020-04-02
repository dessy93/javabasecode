package com.leetCode;

public class isAnagram {

    public static boolean isAnagram(String s, String t) {
       int[] z = new int[26];
       for (int i=0;i<s.length();i++){
           z[s.charAt(i) - 'a']++;
       }

       for (int i=0;i<t.length();i++){
           z[t.charAt(i)-'a']--;
       }

       for (int i=0;i<26;i++){
           if (z[i] != 0)
               return false;
       }

       return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagrzm","nagaram"));
    }
}
