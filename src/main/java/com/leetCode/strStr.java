package com.leetCode;

public class strStr {

    public static int strStr(String haystack, String needle) {
        for (int i=0;i<haystack.length() - needle.length()+1;i++) {
            int j=0;
            for (;j<needle.length();j++){
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
            }
            if (j == needle.length())
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aabba","ba"));
    }
}
