package com.leetCode;

/**
 * 字符串转换整数 (atoi)
 * https://leetcode-cn.com/problems/string-to-integer-atoi/
 */

/**
 * 通过ascaii码 或者 正则进行数字匹配
 */
public class myAtoi {

    public static int myAtoi(String str) {
        StringBuffer s = new StringBuffer();

        for (int i=0;i<str.length();i++){
            if ((str.charAt(i)>=48 && str.charAt(i)<=57) || (i ==0 && str.charAt(i) =='-')){
                s.append(String.valueOf(str.charAt(i)));
            }
        }

        try {
            Integer.valueOf(s.toString());
        }catch (Exception e){
            if (str.charAt(0) != '-')
                return Integer.MAX_VALUE;
            else
                return Integer.MIN_VALUE;

        }

        if (s != null)
            return  Integer.valueOf(s.toString());
        else
            return 0;

    }

    public static void main(String[] args) {
        System.out.println(myAtoi("1231223123123131231 sdqweq qweqweqw"));
    }
}
