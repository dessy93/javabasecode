package com.leetCode.test;

public class isOneBitCharacter {

    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
      while (i<bits.length-1){
          if (bits[i] == 1) {
              i = i + 2;
              continue;
          }
          if (bits[i] == 0)
              i = i+1;
      }

      if (i+1 == bits.length-1 && bits[i+1] == 0)
          return true;

      if (i == bits.length-1 && bits[i] == 0)
          return true;

      return false;
    }

    public static void main(String[] args) {
        int[] a = {1,0,0};
        System.out.println(isOneBitCharacter(a));
    }
}
