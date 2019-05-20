package main.java.com.javaBase.statictest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class staticClass {

    public static int a = 1;
    public static void f(){
        HashMap hashMap = new HashMap();

        Hashtable hashTable = new Hashtable<>();

        HashSet hashSet = new HashSet();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        System.out.println("haha");
    }
}
