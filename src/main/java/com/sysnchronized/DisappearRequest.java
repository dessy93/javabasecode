package com.sysnchronized;

public class DisappearRequest implements Runnable {
    static int a = 0;
    static DisappearRequest instance = new DisappearRequest();

    @Override
    public  void run() {
        for (int i = 0;i<10000;i++)
            a++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a);
    }
}
