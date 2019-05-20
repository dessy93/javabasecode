package com.javaBase.CAS;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Dessy
 * @Date: 18-11-24
 * @Desc:一个使用AtomCInteger的例子
 */
public class Sequence {

    private AtomicInteger count = new AtomicInteger(0);

    private Integer countWithouCas = 0;
    public int next(){
        while (true){
            int current = count.get();
            int next = current + 1;
            if (count.compareAndSet(current,next)){
                return next;
            }
        }
    }

    public int nextWithoutCas(){
        while (true){
            return countWithouCas++;
        }
    }
}
