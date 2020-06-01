package com.leetCode.te;

public class isPalindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }else if (x == 0){
            return true;
        }else {
            char[] c = String.valueOf(x).toCharArray();
            for (int i=0;i<(c.length +1)/2;i++){
                if (c[i] != c[c.length -1 -i])
                    return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
