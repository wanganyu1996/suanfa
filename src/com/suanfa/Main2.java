package com.suanfa;

/**
 * 快速排序 时间复杂度 nlogn
 * Created by wanganyu on 2018/04/15.
 */
public class Main2 {
    public static void quickSort(int start,int end,int a[]){
        if(start<end) {
            int left = start, right = end;
            int v = a[left];
            while (left < right) {
                while (left <right && a[right] >= v) {
                    right--;
                }
                a[left] = a[right];
                while (left < right && a[left] <= v) {
                    left++;
                }
                a[right] = a[left];
            }
            a[left] = v;
            quickSort(start, left - 1, a);
            quickSort(left + 1, end, a);
        }

    }
    public static void partition(int a[],int left, int right){
        if(left>right)
            return;
        int i=left,j=right;
        int temp=a[left];
        int t;
        while(i!=j){
            while(i<j&&a[j]>=a[left]){
                j--;
            }
            while(i<j&&a[i]<=a[left]){
                i++;
            }
            if(i!=j){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        a[left]=a[i];
        a[i]=temp;
        partition(a,left,i-1);
        partition(a,i+1,right);
    }
    public static void main(String[] args){
        int nums[]={12,342,234,331,33,123,31,78,8,66,1};
        //1 8 12 31 33 66 78 123 234 331 342
        //1 8 12 31 33 66 78 123 234 331 342
        //1 8 12 31 33 66 78 123 234 331 342 
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
       //quickSort(0,nums.length-1,nums);
       partition(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
