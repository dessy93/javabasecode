package com.leetCode;

public class game {

    public int game(int[] guess, int[] answer) {
        int count =0;
        for (int i=0;i<guess.length;i++){
            if (guess[i] == answer[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
