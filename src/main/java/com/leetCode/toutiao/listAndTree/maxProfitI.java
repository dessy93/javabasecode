package com.leetCode.toutiao.listAndTree;

public class maxProfitI {

    public int maxProfit(int[] prices) {

        int max = 0;
        for (int i=1;i<prices.length;i++){
            max += (prices[i]-prices[i-1])>0?(prices[i]-prices[i-1]) : 0;
        }

        return max;
    }
}
