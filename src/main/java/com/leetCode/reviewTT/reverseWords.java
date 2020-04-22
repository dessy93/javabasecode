package com.leetCode.reviewTT;

public class reverseWords {

    public static String reverseWords(String s) {
        String[] str = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=str.length-1;i>=0;i--)
            if (!str[i].equals("")){
                stringBuilder.append(str[i]);
                stringBuilder.append(" ");
            }
        if (stringBuilder.length() >=1 && stringBuilder.charAt(stringBuilder.length()-1) == ' '){
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world!  "));
    }
}
