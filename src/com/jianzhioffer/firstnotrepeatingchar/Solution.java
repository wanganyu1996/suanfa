package com.jianzhioffer.firstnotrepeatingchar;

public class Solution {
    public  static int FirstNotRepeatingChar(String str) {
        char s[] = new char[256];
        char[] arr = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            s[i] = 0;
        }
        for(int i=0;i<str.length();i++){
            s[arr[i]]++;
        }
        for (int j = 0; j < str.length(); j++) {
            if(s[arr[j]]>1){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstNotRepeatingChar("abvdd");
    }
}
