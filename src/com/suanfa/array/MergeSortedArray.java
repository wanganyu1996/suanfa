package com.suanfa.array;

import java.util.Arrays;

/**
 * 两个有序数组的合并排序
 */
public class MergeSortedArray {

    public static void mergeSorted(int []arr1,int []arr2){
        int length=arr1.length+arr2.length;
        int result[]=new int[length];
        int i=0,j=0,count=0;
        while(i<arr1.length&&j<arr2.length){
           if(arr1[i]<arr2[j]){
                result[count++]=arr1[i];
                i++;
            }else if(arr1[i]==arr2[j]){
               result[count++]=arr1[i];
               i++;
               j++;
           }else{
               result[count++]=arr2[j];
               j++;
           }
        }
        while(i<arr1.length){
            result[count++]=arr1[i++];
        }
        while(j<arr2.length){
            result[count++]=arr2[j++];
        }
       for(int k=0;k<count;k++){
           System.out.print(result[k]+" ");
       }
    }


    public static void main(String[] args) {
      int arr1[]={1,2,6,7,15,16,17,89};
      int arr2[]={0,2,3,4,5,11,14,18,21,31};
        merge(arr1,arr2);
        System.out.println();

    }
    public static void merge(int [] arr1,int [] arr2){
        int len1 = arr1.length;//数组1长度
        int len2 = arr2.length;//数组2长度
        int len = len1 + len2;//合并后数组长度
        int arr[] = new int[len];//合并后的数组
        int j = len1-1;
        int i = len2-1;
        len--;
        while(i>=0&&j>=0){//从后向前比较
            if(arr2[i]>arr1[j]){//将第二个数组的最后第i个元素放入arr中
                arr[len--] = arr2[i];
                i--;//“指针”后移一位
            }else if(arr2[i]<=arr1[j]){//将第一个数组的最后第i个元素放入arr中
                arr[len--] = arr1[j];
                j--;//“指针”后移一位
            }
        }
        if(i>j){//将剩余的数组1或者数组2的元素全部追加到数组arr
            while(i>=0){
                arr[len--] = arr2[i--];
            }
        }else{
            while(j>=0){
                arr[len--] = arr1[j--];
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }


}
