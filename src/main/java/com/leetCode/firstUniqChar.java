package com.leetCode;

public class firstUniqChar {

    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] ch = new int[26];
        for (char c : chars){
            ch[c - 'a']++;
        }

        for (int i=0;i<chars.length;i++){
           if (ch[chars[i] - 'a'] == 1){
               return i;
           }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
