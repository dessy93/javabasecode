package com.leetCode;

public class isPowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n<=0)
            return false;
        if (n==1)
            return true;
        for (int i=1;i<n;i++){
            if (Math.pow(3,i) == n)
                return true;
            if (Math.pow(3,i) > n)
                return false;
        }

        return false;
    }

    public static void main(String[] args) {

    }

}
