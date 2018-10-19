package com.leetcode.reversesentence;

public class Solution {


    public static void reverseStr(char str[],int start,int end){
        while(start<end){
            char temp= str[start];
            str[start] = str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }
    public static String ReverseSentence(String str) {
       if(str==null||str==""){
           return str;
       }
       char arr[]=str.toCharArray();
       reverseStr(arr,0,str.length()-1);
        System.out.println(String.valueOf(arr));
       int start=0,end;
       while(start<arr.length){
           if(arr[start]==' '){
              start++;
           }
           end=start;
           while(end<arr.length&&arr[end]!=' '){
              end++;
           }
           reverseStr(arr,start,end-1);
           start=end;
       }
       return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String str="this is a good thing";
        System.out.println(ReverseSentence(str));
    }
}
