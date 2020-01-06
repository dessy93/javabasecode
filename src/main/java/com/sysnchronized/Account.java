package com.sysnchronized;

public class Account {

    /**
     * 账户类
     */
    private static volatile int count = 100;

    public synchronized void add(int m){
        String name = Thread.currentThread().getName();
        System.out.println("对象锁添加" + m + "钱，" + name + "添加后：" + (count+=m));
    }

    public synchronized void mul(int m){
        String name = Thread.currentThread().getName();
        System.out.println("对象锁减少" + m + "钱，" + name + "消费后：" + (count-=m));
    }

}
