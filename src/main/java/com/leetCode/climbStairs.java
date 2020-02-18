package com.leetCode;

public class climbStairs {

    public int climbStairs(int n) {

       int[] z = new int[n];
       if (n ==1 )
           return 1;
       if (n==2)
           return 2;
       z[0] = 1;
       z[1] = 2;
       for (int i=2;i<n;i++){
           z[i] = z[i-1] + z[i-2];
       }

       return z[n-1];

    }

    public static void main(String[] args) {

    }
}
