package com.leetCode.test;

public class numTimesAllBlue {
    public static boolean isBlue(int[] z,int n){

        for (int i=0;i<n;i++)
            if (z[i] == 0)
                return false;

        return true;
    }
    public static int numTimesAllBlue(int[] light) {
        int max = 0 ;
        for (int i=0;i<light.length;i++)
            if (max < light[i])
                max = light[i];

        int[] z = new int[max+1];
        int count =0;
        max = 0;
        for (int i=0;i<light.length;i++){
            z[light[i]-1] = 1;
            if ((light[i]-1) > max)
                max = light[i]-1;
            if (isBlue(z,max)){
                count++;
                System.out.println(i);
            }


        }

        return count;
    }

    public static void main(String[] args) {
        int[] light = {4,1,2,3};

        System.out.println(numTimesAllBlue(light));
    }
}
