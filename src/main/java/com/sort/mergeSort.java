package com.sort;

public class mergeSort {

    public static void mergeSortF(int a[],int l,int r){

        if (l == r)
            return;
        int mid = (l+r)/2;
        mergeSortF(a,l,mid);
        mergeSortF(a,mid+1,r);
        merge(a,l,r,mid);
    }

    public static void merge(int a[],int l,int r,int mid){
        int k[] = new int[r-l+1];

        int i=0,p1=l,p2=mid+1;

        while (p1 <= mid && p2 <= r){
            k[i++] = (a[p1] < a[p2]) ? a[p1++] : a[p2++];
        }

        while (p1 <= mid){
            k[i++] = a[p1++];
        }

        while (p2 <= r){
            k[i++] = a[p2++];
        }


        for (int j=0;j<k.length;j++){
            a[l+j] = k[j];
        }
    }
    public static void main(String[] args) {
        int a[] = {1,3,2,5,9,2,3,4,5,6,1};
        //int a[] = {2,1};
        mergeSortF(a,0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
