package com.javaBase.Thread;

import java.util.Arrays;

public class Bank {

    private  final   double[]  accounts;

    public Bank(int n,double init) {
       accounts = new double[n];
        Arrays.fill(accounts,init);
    }

    public synchronized void  transfer(int from,int to,double amount){
        if (accounts[from] < amount)
            return;
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d",amount,from,to);
        accounts[to] += amount;
        System.out.printf(" Total Blance: %10.2f%n",getTotalBlance());

    }

    public double getTotalBlance(){
        double sum = 0;

        for (double a : accounts){
            sum += a;
        }
        return sum;
    }

   public int size(){
        return accounts.length;
   }
}
