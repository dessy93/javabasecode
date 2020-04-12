package com.leetCode.toutiao.LinkList;

import com.designPattern.AbstractFactory.Link;

public class addTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result= new ListNode(0);
        ListNode p=l1,q=l2;
        ListNode cur = result;
        int carry = 0;
        while (p != null || q!= null){
            int num1 = (p != null)? p.val : 0;
            int num2 = (q != null)? q.val : 0;
            int sum = num1+ num2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;

            if (p != null)
                p = p.next;

            if (q != null)
                q = q.next;

        }



        if (carry > 0){
            cur.next = new ListNode(carry);
        }


        return result.next;

    }
}
