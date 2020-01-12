package com.javaBase.fanxing;

class ArrayCollect{
    public static <T> T getMiddle(T... a){
        return a[a.length/2];
    }

    public static <T extends Comparable> T getMin(T... a){
        T min = a[0];
        for (int i=0;i<a.length;i++){
            if (min.compareTo(a[i]) > 0)
                min = a[i];
        }
        return min;
    }
}
public class pairTest1 {

    public static void main(String[] args) {
        System.out.println(ArrayCollect.<String>getMiddle("a","b","c"));
        System.out.println(ArrayCollect.<String>getMin("a","b"));
    }
}
