package com.leetCode;

import java.util.HashSet;
import java.util.Set;

public class isHappy {

    public static boolean isHappy(int n) {
//        int num = n;
//        Set<Integer> set = new HashSet<>();
//        while (true){
//            if (num == 1){
//                return true;
//            }
//            if (set.contains(num)){
//                return false;
//            }
//
//            set.add(num);
//            num = cul(num);
//
//        }
        int slow=n,fast=n;
        do{
            slow = cul(slow);
            fast = cul(fast);
            fast = cul(fast);
        }while (slow != fast);

        return slow == 1;
    }

    public static int cul(int num){
        int sum=0;
        while (num >0){
            sum += (num%10)*(num%10);
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }


}
