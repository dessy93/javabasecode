package com.java8.lambda;

public class Main {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
        }}).start();
    }
}
