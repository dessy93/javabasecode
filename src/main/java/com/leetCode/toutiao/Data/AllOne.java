package com.leetCode.toutiao.Data;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

/**
 * 实现一个数据结构支持以下操作：

 Inc(key) - 插入一个新的值为 1 的 key。或者使一个存在的 key 增加一，保证 key 不为空字符串。
 Dec(key) - 如果这个 key 的值是 1，那么把他从数据结构中移除掉。否者使一个存在的 key 值减一。如果这个 key 不存在，这个函数不做任何事情。key 保证不为空字符串。
 GetMaxKey() - 返回 key 中值最大的任意一个。如果没有元素存在，返回一个空字符串""。
 GetMinKey() - 返回 key 中值最小的任意一个。如果没有元素存在，返回一个空字符串""。
 挑战：以 O(1) 的时间复杂度实现所有操作。

 https://leetcode-cn.com/explore/interview/card/bytedance/245/data-structure/1033/
 */

public class AllOne {

    Map<String,Integer> map = new HashMap<>();
    String maxKey ;
    String minKey ;
    /** Initialize your data structure here. */
    public AllOne() {
        this.maxKey = "";
        this.minKey = "";

    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        int i;
        if (map.containsKey(key)){
            i = map.get(key);
            map.put(key,++i);
        }else {
            i = 1;
            map.put(key,i);
        }
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        if (map.containsKey(key)){

            if (map.get(key) == 1){
                map.remove(key);
            }else {
                int i = map.get(key);
                map.put(key,--i);
            }
        }else {
            return ;
        }
    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        int maxValue = Integer.MIN_VALUE;
        if (map.isEmpty()){
            return "";
        }else {
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry entry = (Map.Entry)iterator.next();
                if (maxValue < (int)entry.getValue()){
                    maxValue = (int)entry.getValue();
                    maxKey = (String)entry.getKey();
                }
            }
            return maxKey;
        }
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        int minValue = Integer.MAX_VALUE;
        if (map.isEmpty()){
            return "";
        }else {
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry entry = (Map.Entry)iterator.next();
                if (minValue > (int)entry.getValue()){
                    minValue = (int)entry.getValue();
                    minKey = (String)entry.getKey();
                }
            }
            return minKey;
        }
    }


}
