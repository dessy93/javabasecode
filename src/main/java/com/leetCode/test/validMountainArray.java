package com.leetCode.test;

public class validMountainArray {

    public static boolean validMountainArray(int[] A) {
        int length = A.length;
        int top = 0;
        if (length < 3)
            return false;
        for (int i=0;i<length-1;i++){
            if (A[i] < A[i+1])
                continue;
            if (A[i] == A[i+1])
                return false;
            if (A[i] > A[i+1]){
                top = i;
                break;
            }

        }
        if (top == length-1 || top == 0)
            return false;

        for (int i = top;i<length-1;i++){
            if (A[i] > A[i+1])
                continue;
            else
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        int[] a = {1,3,2};
        System.out.println(validMountainArray(a));
    }
}
