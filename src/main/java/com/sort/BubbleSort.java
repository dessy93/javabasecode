package com.sort;

public class BubbleSort {

    public static void BubbleSortF(int a[]){

        if (a == null || a.length<=1)
            return;

        for (int i=0;i<a.length;i++)
            for (int j=a.length-1;j>i;j--){
            if (a[j] < a[j-1]){
                int tmp;
                tmp = a[j];
                a[j] = a[j-1];
                a[j-1] = tmp;
            }
            }
    }


    public static void main(String[] args) {
        int a[] = {1};
        //int a[] = {2,1};
        BubbleSortF(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
