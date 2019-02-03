package com.jianzhioffer.deleteDuplication;

public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null||pHead.next==null){
            return null;
        }
        ListNode next = pHead.next;
        if(next.val==pHead.val){
          while(next!=null&&next.val==pHead.val){
              next = next.next;
          }
            return deleteDuplication(next);
        }else{
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }

    }
    class ListNode{
        ListNode next;
        int val;
    }
}
