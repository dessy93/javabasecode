package com.leetCode.toutiao.listAndTree;

public class getIntersectionNode {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null){
            return null;
        }
        ListNode aLen = headA;
        ListNode bLen = headB;
        int aCount=0,bCount=0;
        while (aLen.next != null){
            aCount++;
            aLen = aLen.next;
        }

        while (bLen.next != null){
            bCount++;
            bLen = bLen.next;
        }

        //如果最后一个元素不相同 则无交叉
        if (aLen != bLen)
            return null;

        aLen = headA;
        bLen = headB;

        if (aCount > bCount){
            int i = aCount - bCount;
            while (i-->0){
                aLen = aLen.next;
            }
        }else {
            int i = bCount - aCount;
            while (i-- > 0){
                bLen = bLen.next;
            }
        }

        while (aLen != null && bLen != null){
            if (aLen == bLen){
                return aLen;
            }else {
                aLen = aLen.next;
                bLen = bLen.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        ListNode listNod3 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNod3;

        ListNode llistNode = new ListNode(8);
        llistNode.next = listNode2;


        System.out.println(getIntersectionNode(listNode,llistNode).val+"");
    }


}
