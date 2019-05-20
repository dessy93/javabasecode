package com.leetCode;

/**
 * @Author: Dessy
 * @Date: 18-11-24
 * @Desc:给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class addTwoNumbers {

    /**
     * Definition for singly-linked list.
     *
   */

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, curr = result;

        int carry = 0;

        while (p != null || q!= null){
            int x = (p != null)?p.val:0;
            int y = (q != null)?q.val:0;
            int sum = x+ y + carry;
            carry = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (p != null) p=p.next;
            if (q != null) q=q.next;
        }

        if (carry > 0 ){
            curr.next = new ListNode(carry);
        }

        return result.next;

    }

    public static void main(String[] args) {
        ListNode l1= new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2= new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = addTwoNumbers(l1,l2);
        while (l3 != null){
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }


}
