package com.leetCode.toutiao.listAndTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode sortList(ListNode head) {
        ListNode headNode = new ListNode(0);
        List<Integer> list = new ArrayList<>();
        ListNode l = head;
        while (l != null){
            list.add(l.val);
            l = l.next;
        }

        Collections.sort(list,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (Integer i : list){
            ListNode listNode = new ListNode(i);
            listNode.next = headNode.next;
            headNode.next = listNode;
        }

        return headNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        ListNode listNod3 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNod3;

        sortList(listNode);
    }
}
