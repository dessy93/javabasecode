package com.Thread;

public class UnsynchBankTest {

    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BLANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS,INITIAL_BLANCE);

        for (int i=0;i<NACCOUNTS;i++){
            int fromAccount = i;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                   try {
                       while (true){
                           int toAccount = (int)(bank.size() * Math.random());
                           double amout = MAX_AMOUNT*Math.random();
                           bank.transfer(fromAccount,toAccount,amout);
                           Thread.sleep(100);
                       }
                   }catch (InterruptedException e){

                   }
                }
            });

            t.start();
        }
    }
}
