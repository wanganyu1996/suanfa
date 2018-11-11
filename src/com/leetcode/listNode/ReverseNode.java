package com.leetcode.listNode;

public class ReverseNode {

    public ListNode reverseList(ListNode head) {
        //1=>2=>3  3>=2>=1
        ListNode next;
        ListNode reverseNode = null;
        while (head != null) {
            next = head.next;
            head.next = reverseNode;
            reverseNode = head;
            head = next;
        }
        return reverseNode;
    }



    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
