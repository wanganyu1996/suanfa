package com.suanfa;

/**
 * 定义局部最小的概念.
 *
 * arr长度为1时, arr[0]是局部最小
 * arr长度为N(N > 1)时, 如果arr[0] < arr[1], 那么arr[0]是局部最小
 * 如果arr[N-1] < arr[N-2]时, 那么arr[N-1]是局部最小
 * 如果0 < i< N-1, 既有 arr[i] < arr[i - 1], 又有arr[i] < arr[i + 1], 那么arr[i]是局部最小
 * 给定一个无序数组arr, 已知arr中任意两个相邻的数都不相等. 写一个函数, 只需返回arr中任意一个局部最小出现的位置即可.
 * 分析
 * 顺序遍历是最直接的方法, 时间复杂度是O(n).
 * 下面介绍一种时间复杂度O(logN)的方法.
 * 基本思想: 二分查找.
 *
 * 如果数组长度为0, 返回 -1
 * 如果数组长度为1, 返回0
 * 如果arr[0] < arr[1], 返回0
 * 如果arr[size - 1] < arr[size - 2], 返回size - 1
 * 从arr[1]到arr[size - 2]开始二分查找
 * left = 1, right = size - 2
 * mid = left + (right - left) / 2
 * 如果arr[mid] > arr[mid - 1], 那么在mid左侧,必然存在局部最小位置, 令righ = mid - 1. 继续二分查找
 * 举个栗子: 对于数组 {x, 2, 3, 5, 6}, mid = 2, arr[2] > arr[1], 如果处于位置0的x值小于2, 那么满足第三步的条件, 所以x值一定大于2, 位置1即是满足条件的位置.
 * 同样可以分析, 如果arr[mid] > arr[mid + 1], 那么在mid右侧, 必然存在局部最小位置, 令left = mid + 1. 继续二分查找.
 * 如果不满足5.3, 5.4, 那么mid所在位置即是满足条件的位置.
 *
 * 作者：周肃
 * 链接：https://www.jianshu.com/p/bc8ca0c50ba3
 * 來源：简书
 * 简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。
 */
public class Solution {

    public static int partialMinimum(int arr[]){
       if(arr.length==0){
           return -1;
       }
       if(arr.length==1||arr[0]<arr[1]){
           return 0;
       }
       if(arr[arr.length-1]<arr[arr.length-2]){
           return arr.length-1;
       }
       int left=1,right=arr.length-2;
       int mid=0;
       while(left<=right){
           mid=(left+right)/2;
           if(arr[mid-1]<arr[mid]){
               right=mid-1;
           }else if(arr[mid]>arr[mid+1]){
               left=mid+1;
           }else{
               return mid;
           }
       }
       return -1;
    }
    /**
     *顺序遍历
     */
    //(1)获得局部最小的位置
    public static int GetMinArr(int[]arr)
    {
        if(arr==null||arr.length==0)
        {
            return Integer.MIN_VALUE;
        }
        if(arr.length==1)
        {
            return arr[0];
        }
        if(arr[0]<arr[1])
        {
            return arr[0];
        }
        if(arr[arr.length-1]<arr[arr.length-2])
        {
            return arr[arr.length-1];
        }
        int re=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i-1]>arr[i]&&arr[i]<arr[i+1])
            {
                re=arr[i];
                break;
            }

        }
        return re;

    }

    /**
     * 二分查找
     * @param arr
     * @return
     */
    public static int GetMinArr2(int[]arr)
    {
        if(arr==null||arr.length==0)
        {
            return -1;
        }
        if(arr.length==1)
        {
            return arr[0];
        }
        if(arr[0]<arr[1])
        {
            return arr[0];
        }
        if(arr[arr.length-1]<arr[arr.length-2])
        {
            return arr[arr.length-1];
        }
        int left=1;
        int right=arr.length-2;
        int mid=0;
        while(left<right)
        {
            mid=(left+right)/2;
            if(arr[mid]>arr[mid-1])
            {
                right=mid-1;
            }else if(arr[mid]>arr[mid+1]){
                left=mid+1;
            }else{
                return arr[mid];
            }

        }
        return arr[right];
    }

    public static void main(String[] args) {
        int[]arr1={1};
        int[]arr2={4,3,5,7,9};
        System.out.println(partialMinimum(arr1));
        System.out.println(partialMinimum(arr2));
        System.out.println(GetMinArr2(arr2));
    }
}
