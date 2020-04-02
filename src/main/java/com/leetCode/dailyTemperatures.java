package com.leetCode;

import java.util.Stack;

public class dailyTemperatures {

    public static int[] dailyTemperatures(int[] T) {
        for (int i=0;i<T.length;i++){
            int flag = 0;
            for (int j=i+1;j<T.length;j++){
                if (T[i] < T[j]){
                    flag = 1;
                    T[i] = j-i;
                    break;
                }
            }

            if (flag == 0)
                T[i] = 0;
        }
        return T;

    }


    public static int[] dailyTemperatures1(int[] T) {
        int[] z= new int[T.length];
        Stack<Integer> s = new Stack<>();
        for (int i = T.length-1;i>=0;i--){
            while (!s.isEmpty() && T[s.peek()] <= T[i]) s.pop();
            z[i] = s.isEmpty() ? 0 : s.peek() - i;
            s.push(i);
        }
        return z;

    }

    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(dailyTemperatures1(T));
        System.out.println("");
    }
}
