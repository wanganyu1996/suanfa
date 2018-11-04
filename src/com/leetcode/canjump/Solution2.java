package com.leetcode.canjump;

class Solution2 {
    public boolean canJump(int[] nums) {
      if(nums==null){
          return false;
      }
        int length = nums.length;
        int far = -1;
        for(int i=0;i<length;i++){
            if(nums[i]>far){
                far = nums[i];
            }
            if(far>=length-i-1){
                return true;
            }
            if(far==0){
                return false;
            }
            far--;
        }
        return false;
    }
}
