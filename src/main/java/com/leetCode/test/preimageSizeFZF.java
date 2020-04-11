package com.leetCode.test;

public class preimageSizeFZF {

    public static int preimageSizeFZF(int K) {
        int res = 0;
        while (K % 5==0){
            res += K/5;
            K = K/5;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(preimageSizeFZF(10000000));
    }
}
