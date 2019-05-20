package main.java.com.leetCode.toutiao.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class checkInclusion {

    public static boolean checkInclusion(String s1, String s2) {
        for (int i=0;i<s2.length();i++){

            if (s2.charAt(i) == s1.charAt(0)){
                for (int j=0;j<s1.length();j++){
                    if (s2.charAt(i) == s1.charAt(j)){

                    }else {
                        break;
                    }
                    if (j == s1.length()-1)
                        return true;

                    if (++i == s2.length())
                        break;

                }
            }

        }

        for (int i=s2.length() -1 ;i>=0;i--){
            if (s2.charAt(i) == s1.charAt(0)){
                for (int j=0;j<s1.length();j++){
                    if (s2.charAt(i) == s1.charAt(j)){

                    }else {
                        break;
                    }
                    if (j == s1.length()-1)
                        return true;

                    if (--i == -1)
                        break;

                }
            }
        }

        return false;
    }

    public static boolean checkInclusion1(String s1, String s2){

        if (s1.length() > s2.length())
            return false;

        for (int i=0;i<s2.length() && i+s1.length()<=s2.length();i++){
            if (f(s1,s2.substring(i,i+s1.length())))
                return true;
        }

        return false;

    }

    public static boolean f(String s1,String s2){
        int[] c1 = new int[26];
        int[] c2 = new int[26];

       for (int i=0;i<s1.length();i++){
           c1[s1.charAt(i) - 'a'] ++;
           c2[s2.charAt(i) - 'a'] ++;
       }

       for (int i=0;i<c1.length;i++){
           if (c1[i] != c2[i])
               return false;
       }
       return true;

    }

    public static void main(String[] args) {
        System.out.println(checkInclusion1("hello","ooleh"));

    }
}
