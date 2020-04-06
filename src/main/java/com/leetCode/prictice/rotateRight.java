package com.leetCode.prictice;

import java.util.LinkedList;
import java.util.List;

public class rotateRight {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        if (k == 0)
            return head;
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        tail.next = head;
        int index = (length - (k % length));
        tail = head;
        for (int i = 0; i < index - 1; i++)
            tail = tail.next;

        head = tail.next;
        tail.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNode = rotateRight(listNode1, 2);
        System.out.println(listNode.val);
    }
}
