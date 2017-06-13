package com.zhangmingxu.jianzhioffer;

import java.util.*;

/**
 * Created by 张明旭 on 2017/6/9.
 * 题目描述
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (listNode == null) {
            return list;
        } else {
            ListNode pre = null;
            ListNode cur = listNode;
            ListNode next = listNode;
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            while (pre != null) {
                list.add(pre.val);
                pre = pre.next;
            }
            return list;
        }
    }
}
