package com.leetCode.toutiao.LinkList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {

        List<Integer> list = new ArrayList<>();
        ListNode head= new ListNode(0);
        ListNode p = head;
        for (ListNode listNode : lists){
            while (listNode != null){
                list.add(listNode.val);
                listNode = listNode.next;
            }
        }

        Collections.sort(list);



        for (int i : list){
            p.next = new ListNode(i);
            p =  p.next;
        }

        return head.next;

    }

}
