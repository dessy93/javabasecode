package com.designPattern.Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }
    }
}
