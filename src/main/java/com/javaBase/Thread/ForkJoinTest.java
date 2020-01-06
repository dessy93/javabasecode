package com.javaBase.Thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.function.DoublePredicate;

public class ForkJoinTest {

    static class Counter extends RecursiveTask<Integer>{

        public static final int THRESHOLD = 10000;
        private double[] values;
        private int to;
        private int from;
        private DoublePredicate filter;

        public Counter(double[] values, int to, int from, DoublePredicate filter) {
            this.values = values;
            this.to = to;
            this.from = from;
            this.filter = filter;
        }

        @Override
        protected Integer compute() {
            if (to - from >THRESHOLD){
                int count = 0;
                for(int i=from;i<to;i++){
                    if (filter.test(values[i])) count++;
                }
                return count;
            }else {
                int mid = (to + from)/2;
                Counter first = new Counter(values,to,mid,filter);
                Counter sencond = new Counter(values,mid,to,filter);
                invokeAll(first,sencond);
                return first.join() + sencond.join();
            }
        }
    }

    public static void main(String[] args) {
        final int SIZE = 10000000;
        double[] numbers = new double[SIZE];
        for (int i=0;i<SIZE;i++)
            numbers[i] = Math.random();

        Counter counter = new Counter(numbers,0,numbers.length,x -> x >0.5);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(counter);
        System.out.println(counter.join());
    }
}
