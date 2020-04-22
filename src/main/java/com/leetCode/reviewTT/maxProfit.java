package com.leetCode.reviewTT;

public class maxProfit {

    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i=0;i<prices.length;i++)
            for (int j=i+1;j<prices.length;j++){
                max = max > (prices[j] - prices[i]) ? max : (prices[j] - prices[i]);
            }

        return max;
    }

    public static int maxProfit1(int[] prices) {
        int max = 0;
        for (int i=0;i<prices.length-1;i++){
            max += (prices[i+1] - prices[i]) > 0 ? (prices[i+1] - prices[i]):0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(maxProfit1(a));
    }
}
