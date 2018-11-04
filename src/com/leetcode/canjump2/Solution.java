package com.leetcode.canjump2;

class Solution {
    public int jump(int[] nums) {
      int cur=0,next=0,jump=0;
      for(int i=0;i<nums.length;i++){
          if(cur<i){
              jump++;
              cur = next;
          }
          next = Math.max(next, nums[i] + i);
      }
     return jump;
    }
}
