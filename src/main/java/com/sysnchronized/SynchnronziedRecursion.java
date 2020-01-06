package com.sysnchronized;

public class SynchnronziedRecursion {

    int a = 0;
    public static void main(String[] args) {
        SynchnronziedRecursion synchnronziedRecursion = new SynchnronziedRecursion();
        synchnronziedRecursion.method1();
    }

    private synchronized void method1(){
        System.out.println("method " +  a);
        if (a == 0){
            a++;
            method1();
        }
    }
}
