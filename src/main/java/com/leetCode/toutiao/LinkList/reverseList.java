package com.leetCode.toutiao.LinkList;


import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class reverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode listNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return listNode;
    }

}
