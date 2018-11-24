package com.jianzhioffer.getnumberofk;

public class Solution {
    public int GetNumberOfK(int[] array, int k) {
        int left = binarySearch(array, k);
        int right = binarySearch(array, k + 1);
        return (left==array.length||array[left]!=k)? 0:right - left ;
    }

    public int binarySearch(int[] arr, int k) {
        int left = 0, right = arr.length, mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] >= k) {
                right = mid;
            } else  {
                left = mid+1;
            }
        }
        return left;
    }

}
