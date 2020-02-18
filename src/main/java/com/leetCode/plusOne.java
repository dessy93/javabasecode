package com.leetCode;

public class plusOne {
    public static int[] plusOne(int[] digits) {
        int isPlus = 1;
        for (int i = digits.length-1;i>=0;i--){
            if (digits[i] + isPlus == 10){
                isPlus = 1;
                digits[i] = 0;
                continue;
            }else {
                digits[i] += isPlus;
                isPlus = 0;
                break;
            }
        }

        if (isPlus == 1){
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        int[] result = plusOne(digits);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
