package com.test;

/**
 * 快速排序
 * Created by wanganyu on 2018/05/01.
 */
public class QuickSort {
    public static void main(String[] args){
        int a[]={12,234,5,66,67,7,9,8,0,33,123,66,7,867,67,8,9,0};
        //0  0  5  7  7  8  8  9  9  12  33  66  66  67  67  123  234  867
        //0  0  5  7  7  8  8  9  9  12  33  66  66  67  67  123  234  867
        //0  0  5  7  7  8  8  9  9  12  33  66  66  67  67  123  234  867
        quickSort(0,a.length-1,a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
    public static void quickSort(int left,int right,int arr[]){
        if(left>right) {
            return;
        }

        int start=left,end=right,v=arr[left];
        while(start<end){
            while(end>start&&arr[end]>=v){
                end--;
            }
            arr[start]=arr[end];
            while(start<end&&arr[start]<=v){
                start++;
            }
            arr[end]=arr[start];
        }
        arr[start]=v;
        quickSort(left,start-1,arr);
        quickSort(start+1,right,arr);

    }
    public static void quickSort1(int start,int end,int a[]) {
        if (start < end) {
            int left = start, right = end;
            int v = a[left];
            while (left < right) {
                while (left < right && a[right] >= v) {
                    right--;
                }
                a[left] = a[right];
                while (left < right && a[left] <= v) {
                    left++;
                }
                a[right] = a[left];
            }
            a[left] = v;
            quickSort1(start, left - 1, a);
            quickSort1(left + 1, end, a);
        }
    }
}
