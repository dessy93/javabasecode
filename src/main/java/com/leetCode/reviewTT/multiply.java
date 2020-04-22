package com.leetCode.reviewTT;

public class multiply {

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int[] result = new int[num1.length() + num2.length()];
        for (int i = 0; i < num1.length(); i++)
            for (int j = 0; j < num2.length(); j++) {
                result[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        int degit = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] += degit;
            degit = result[i] / 10;
            result[i] = result[i] % 10;

        }
        String s;
        s = result[0] == 0 ? "" : String.valueOf(result[0]);
        for (int i = 1; i < result.length; i++) {
            s += result[i];
        }
        return s;
    }

    public static void main(String[] args) {
        multiply("123", "456");
    }
}
