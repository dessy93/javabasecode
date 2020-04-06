package com.leetCode.prictice;

public class numTeams {

    public static int numTeams(int[] rating) {
        int cnt = 0;
        for (int i = 0; i < rating.length - 2; i++){
            for (int j = i + 1; j < rating.length - 1; j++)
                for (int k = j + 1; k < rating.length; k++) {
                    if ((rating[i] < rating[j]) && (rating[j] < rating[k]))
                        cnt++;
                    if ((rating[i] > rating[j]) && (rating[j] > rating[k]))
                        cnt++;
                }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = {2,5,3,4,1};
        System.out.println(numTeams(a));
    }
}
