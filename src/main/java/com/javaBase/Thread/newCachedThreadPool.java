package com.javaBase.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newCachedThreadPool {

    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i=0;i<10;i++){
            final int index = i;

            try {
                Thread.sleep(index*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(()->{
                System.out.println(index);
            });
        }
    }
}
