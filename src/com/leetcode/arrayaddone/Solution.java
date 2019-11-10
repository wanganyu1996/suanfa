package com.leetcode.arrayaddone;

public class Solution {

    public int[] plusOne(int[] digits) {
        int go = 0;
        for (int i = digits.length-1; i >=0 ; i--) {
           if(i==digits.length-1){
               if(digits[i]==9){
                   digits[i] = 0;
                   go = 1;
               }else{
                   digits[i]++;
                   return digits;
               }
           }else{
               digits[i] = digits[i] + go;
               if(digits[i]>=10){
                   digits[i] = 0;
                   go=1;
               }else{
                   return digits;
               }
           }
        }
        int dp[] = new int[digits.length + 1];
        dp[0] = 1;
        return dp;
    }
}
