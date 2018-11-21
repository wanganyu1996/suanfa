package com.jianzhioffer.findfirstcommonnode;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = getListLength(pHead1);
        int len2 = getListLength(pHead2);
        int nLengthDif = len1 - len2;
        ListNode pHead1Long = pHead1;
        ListNode pHead2Short = pHead2;
        if(len1<len2){
            pHead1Long = pHead2;
            pHead2Short = pHead1;
            nLengthDif = len2 - len1;
        }
        for (int i = 0; i < nLengthDif; i++) {
            pHead1Long = pHead1Long.next;
        }
        while(pHead1Long!=null&&pHead2Short!=null&&pHead1Long!=pHead2Short){
            pHead2Short = pHead2Short.next;
            pHead1Long = pHead1Long.next;
        }
        return pHead1Long;
    }
    public int getListLength(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
         }
        return count;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
