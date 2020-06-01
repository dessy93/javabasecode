package com.leetCode.te;

import java.util.Stack;

public class isValid {
    public static boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<c.length;i++){
            if (c[i] == '[' || c[i] == '{' || c[i] == '('){
                stack.push(c[i]);
            }else if (c[i] == ']' || c[i] == '}' || c[i] == ')'){
                if (stack.isEmpty())
                    return false;
                Character z = stack.pop();
                if (c[i] == ')'){
                    if (c[i] - z != 1)
                        return false;
                }else {
                    if (c[i] - z != 2)
                        return false;
                }
            }else {
                continue;
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s= "(){}[]";
        System.out.println(isValid(s));

    }
}
