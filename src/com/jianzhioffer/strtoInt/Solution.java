package com.jianzhioffer.strtoInt;

/**
 * 数据上下 溢出
 * 空字符串
 * 只有正负号
 * 有无正负号
 * 错误标志输出
 */
public class Solution {
    public static int StrToInt(String str) {
        if (str.equals("") || str.length() == 0) {
            return 0;
        }
        int flag = 1, sum = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[0] == '+') {
                    continue;
                } else if (arr[i] == '-') {
                    flag = -1;
                    continue;
                }
            }
            if (arr[i] >= '0' && arr[i] <='9') {
                sum = sum * 10 + (int) (arr[i] - '0');
            } else {
                return 0;
            }

        }
        return sum * flag;
    }

    public static void main(String[] args) {
        int a=StrToInt("123");
        System.out.println(a);
    }
}
