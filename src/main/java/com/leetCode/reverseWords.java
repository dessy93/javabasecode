package com.leetCode;

public class reverseWords {

    public static String reverseWords(String s) {
        String[] list = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String k : list){
            sb.append(new StringBuilder(k).reverse() + " ");
        }
        return  sb.deleteCharAt(sb.length()-1).toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hello world"));
    }
}
