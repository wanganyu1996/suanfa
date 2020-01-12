package com.leetcode.countersmall;

import java.util.ArrayList;
import java.util.List;

class Solution {

    int count;

    public int InversePairs(int[] array) {
        count = 0;
        if (array != null) {
            mergeSortCore(array,0,array.length-1);
        }
        return count;
    }

    public  void mergeSortCore(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSortCore(arr, low, mid);
        mergeSortCore(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public  int merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];
        int index = 0, p1 = low, p2 = mid + 1;
        while (p1 <= mid && p2 <= high) {
            if (arr[p1] > arr[p2]) {
                count += mid - p1 + 1;
                count %= 1000000007;
                temp[index++] = arr[p2++];
            } else {
                temp[index++] = arr[p1++];
            }
        }
        while (p1 <= mid) {
            temp[index++] = arr[p1++];
        }
        while (p2 <= high) {
            temp[index++] = arr[p2++];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low++] = temp[i];
        }
        return count;
    }



}