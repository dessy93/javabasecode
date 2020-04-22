package com.leetCode.reviewTT;

import java.util.Stack;

public class simplifyPath {
    public static String simplifyPath(String path) {
        String[] s = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if ((".").equals(s[i])) {
                continue;
            } else if (("..").equals(s[i])) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                if (!("").equals(s[i]))
                    stack.push(s[i]);
            }
        }
        String result = "/";
        if (stack.isEmpty())
            return result;

        for (String ss : stack) {
            if (!("").equals(ss))
                result += (ss + "/");
        }
        if (result.charAt(result.length() - 1) == '/')
            result = result.substring(0, result.length() - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a//b////c/d//././/.."));
    }
}
