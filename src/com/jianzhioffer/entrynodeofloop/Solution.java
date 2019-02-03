package com.jianzhioffer.entrynodeofloop;


/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null||pHead.next.next==null){
            return null;
        }
        ListNode fast = pHead.next.next;
        ListNode slow = pHead.next;
        while(fast!=slow){
            if(fast.next!=null&&fast.next.next!=null){
                //快指针每次走两步
                fast = fast.next.next;
                //慢指针每次走一步
                slow=slow.next;
            }else{
                return null;
            }
        }
        fast=pHead;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    class ListNode{
        ListNode next;
        int val;
    }
}