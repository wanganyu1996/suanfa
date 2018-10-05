package com.leetcode.listNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    static class ListNode {
     int val;
      ListNode next;
     ListNode(int x) {
        val = x;
         next = null;
     }
  }
    public static boolean hasCycle(ListNode head) {
       if(head==null){
           return false;
       }
       ListNode listNode1=head,listNode2=head;
       while(listNode2!=null){
           listNode1=listNode1.next;
           if(listNode2.next!=null){
               listNode2=listNode2.next.next;
           }
           if(listNode1==listNode2){
               return true;
           }
       }
     return false;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        hasCycle(listNode);

    }
}
/**
 public class Solution {
 public boolean hasCycle(ListNode head) {
 if(head==null||head.next==null)
 return false;
 ListNode first=head;
 ListNode second=head;
 while(second!=null&&second.next!=null){

 first=first.next;
 second=second.next.next;
 if(first==second){
 return true;
 }
 }
 return false;
 }
 }
 **/