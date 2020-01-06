package com.leetCode.toutiao.extend;

public class mySqrt {

    public static int mySqrt(int x) {
        if (x <= 0)
            return -1;

        for (long i=1;i<=x;i++){
            if (i*i == x){
                return (int) i;
            }else if (i*i > x){
                return (int)(i-1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
