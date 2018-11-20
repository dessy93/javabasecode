package com.javaBase.fanxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class fanxing {

    //普通方法
    public static Object max(List list){

        return Collections.max(list);
    }

    //泛型方法
    public static <T extends Comparable<? super T>> T fmax(List<T> list){

        return Collections.max(list);
    }

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(3);
        list.add(5);
        list.add(1);
 //       list.add("1");

        System.out.println(max(list));

        List<Integer> flist = new ArrayList<>();
        flist.add(3);
        flist.add(5);
        flist.add(1);
 //       flist.add("1");
        System.out.println(fmax(list));
    }
}
