package com.leetCode.toutiao.Data;

public class MainCache {

    public static void main(String[] args) {
//        LRUCache cache  = new LRUCache(2);
//        cache.put(1, 1);
//        cache.put(2, 2);
//        cache.get(1);       // 返回  1
//        cache.put(3, 3);    // 该操作会使得密钥 2 作废
//        cache.get(2);       // 返回 -1 (未找到)
//        cache.put(4, 4);    // 该操作会使得密钥 1 作废
//        cache.get(1);       // 返回 -1 (未找到)
//        cache.get(3);       // 返回  3
//        cache.get(4);       // 返回  4

          AllOne obj = new AllOne();

          obj.inc("hello");
        obj.inc("goodbye");
        obj.inc("hello");
        obj.inc("hello");
        System.out.println(obj.getMaxKey());
        obj.inc("leet");
        obj.inc("code");
        obj.inc("leet");

        obj.dec("hello");

        obj.inc("leet");
        obj.inc("code");
        obj.inc("code");
        System.out.println(obj.getMaxKey());



    }
}
