package com.leetCode;

public class reverseString {

    public static void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<=j)
        {
            char temp=s[i];
            s[i++]=s[j];
            s[j--]=temp;
        }
    }

    public static void main(String[] args) {
        char[] c = {'h','c','z','z'};
        reverseString(c);
        System.out.println(c);
    }
}
