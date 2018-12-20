package com.jianzhioffer.leftrlotatestring;

public class Solution {
    public String LeftRotateString(String str, int n) {
        char[] srr = str.toCharArray();
        if (srr.length < n) return "";
        reverse(srr, 0, n - 1);
        reverse(srr, n, str.length() - 1);
        reverse(srr, 0, str.length() - 1);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < srr.length; i++) {
            sb.append(srr[i]);
        }
        return sb.toString();
    }

    public void reverse(char[] str, int low, int high) {
        char temp;
        while (low < high) {
            temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }

    }
}
