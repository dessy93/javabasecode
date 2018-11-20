package com.queue;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;

public class priorityQueue {

    public static void main(String[] args) {
        PriorityQueue<LocalDate> dates = new PriorityQueue<>();
        dates.add(LocalDate.of(1906,12,9));
        dates.add(LocalDate.of(1815,12,10));
        dates.add(LocalDate.of(1903,12,3));
        dates.add(LocalDate.of(1910,6,22));

//        System.out.println("1-----");
//        for (LocalDate date :dates){
//            System.out.println(date);
//        }
//
//        System.out.println("2------");
//        while (!dates.isEmpty()){
//            System.out.println(dates.remove());
//        }

        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
//        for (Map.Entry<String,String> entry:map.entrySet()){
//            System.out.println("key " + entry.getKey() +"value  " + entry.getValue());
//        }


//        Map<String,Integer> counts = new HashMap<>();
//        String word = "cxy";
//        counts.put(word,counts.get(word) +1);
//
//        counts.merge(word,1,(a,b) -> a+b);



        //映射试图

        Set<String> key = map.keySet();

        key.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s");
            }
        });


        Collection<String> values = map.values();

        values.forEach((v) ->{
            System.out.println("v: " + v);
        });

        Map<String,String> linkMap =new LinkedHashMap<String,String>(10,0.75F,true);
        linkMap.put("1","a");
        linkMap.put("2","b");
        linkMap.put("3","c");
        Set<String> key1 = linkMap.keySet();

        key1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("link s:" + s);
            }
        });

        System.out.println("---------------");
        linkMap.get("2");
        linkMap.put("2","e");

        Set<String> key2 = linkMap.keySet();
        key2.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("link s:" + s);
            }
        });

    }
}
