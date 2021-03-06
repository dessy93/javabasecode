package com.leetCode.toutiao.listAndTree;

public class maxProfit {

    public int maxProfit(int[] prices) {
        if(prices.length ==0 ) return 0;

        int max = 0,min = prices[0];

        for (int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i] - min);
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
