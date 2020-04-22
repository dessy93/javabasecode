package com.leetCode.reviewTT;

import java.util.Arrays;

public class checkInclusion {

    public static boolean check(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i=0;i<s1.length();i++){
            if (c1[i] != c2[i])
                return false;
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s2.length()-s1.length() < 0)
            return false;
        for (int i=0;i<=s2.length()-s1.length();i++){
            if (check(s2.substring(i,i+s1.length()),s1))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("adc","dcda"));
    }
}
