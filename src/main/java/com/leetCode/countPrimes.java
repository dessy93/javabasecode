package com.leetCode;

import java.util.Arrays;

public class countPrimes {

    public static boolean f(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int countPrimes(int n) {
        int count = 0;
        boolean[] z = new boolean[n];
        Arrays.fill(z, true);
        for (int i = 2; i*i <  n; i++) {
            if (f(i)) {
                for (int j = 2*i; j < n; j += i) {
                    z[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (z[i]) {
                count++;
                //System.out.println(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
