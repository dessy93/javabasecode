package com.javaBase.CAS;

/**
 * @Author: Dessy
 * @Date: 18-11-24
 * @Desc:
 */
public class Main {

    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("t1 count :" + sequence.next());

            }
        });
        /**
         * lambda表达式
         */
        Thread t11 = new Thread(()-> System.out.println("t1 count :" + sequence.next()));


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2 count :" + sequence.next());

            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3 countWithouCas :" + sequence.nextWithoutCas());
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t4 countWithouCas :" + sequence.nextWithoutCas());
            }
        });

        t1.start();
        t2.start();

//        t3.start();
//        t4.start();
    }


}
