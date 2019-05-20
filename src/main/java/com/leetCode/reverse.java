package com.leetCode;

import java.util.Stack;

/**
 * 整数翻转
 * https://leetcode-cn.com/problems/reverse-integer/
 */
public class reverse {

    public static int reverse(int x) {

        String s = String.valueOf(x);

        if (x == 0){
            System.out.printf("0");
            return 1;
        } else if (x < 0){
            s = s.substring(1,s.length());
            System.out.printf("-");
        }
        f(s);

        return 1;
    }

    public static void f(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }

        while (!stack.empty()){
            if (stack.peek().equals('0'))
                break;
            else
                System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        reverse(0);
    }

}
