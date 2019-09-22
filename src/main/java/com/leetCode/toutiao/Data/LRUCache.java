package main.java.com.leetCode.toutiao.Data;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author: Dessy
 * @Date: 19-9-21
 * @Desc:
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 *
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
 *
 * 进阶:
 *
 * 你是否可以在 O(1) 时间复杂度内完成这两种操作？
 *
 * https://leetcode-cn.com/explore/interview/card/bytedance/245/data-structure/1032/
 */

class LinkedNode{
    int key;
    int value;
    LinkedNode next;
    LinkedNode pre;
}
public class LRUCache {

    LinkedNode head,tail;
    int capacity = 0;
    int count = 0;
    Map<Integer,LinkedNode> map = new HashMap<>();

    public void addNode(LinkedNode linkedNode){

        linkedNode.pre = head;
        linkedNode.next=head.next;
        head.next.pre = linkedNode;
        head.next = linkedNode;

    }

    public void removeNode(LinkedNode linkedNode){
        linkedNode.pre.next = linkedNode.next;
        linkedNode.next.pre = linkedNode.pre;
    }

    public void moveToHead(LinkedNode linkedNode){
        this.removeNode(linkedNode);
        this.addNode(linkedNode);
    }

    public LinkedNode popTail(){
        LinkedNode linkedNode = tail.pre;
        this.removeNode(linkedNode);
        return linkedNode;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new LinkedNode();
        tail = new LinkedNode();
        head.pre = null;
        head.next = tail;
        tail.pre = head;
        tail.next = null;
    }

    public int get(int key) {
       LinkedNode linkedNode = map.get(key);
       if (linkedNode == null)
           return -1;
       this.moveToHead(linkedNode);
       return linkedNode.value;
    }

    public void put(int key, int value) {
        LinkedNode linkedNode = map.get(key);
        if (linkedNode == null){
            LinkedNode node = new LinkedNode();
            node.key = key;
            node.value = value;
            this.map.put(key,node);
            this.moveToHead(node);
            count++;
            if (count > capacity){
                LinkedNode removeNde = this.popTail();
                this.map.remove(removeNde.key);
                count--;
            }
        }else {
            //update
            linkedNode.value = value;
            this.moveToHead(linkedNode);
        }
    }

    public static void main(String[] args) {

    }

}
