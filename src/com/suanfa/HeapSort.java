package com.suanfa;

import java.util.Arrays;

/**
 * https://www.cnblogs.com/chengxiao/p/6129630.html
 * Created by wanganyu on 2018/04/28.
 */
public class HeapSort {
    public static void main(String[] args){
       int arr[]={9,4,5,63,3,7,8,3};
       sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        //1.构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子节点从下至上，从右向左调整结构
           adjustHeap(arr,i,arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1;j>=0;j--){
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }

    /**
     * 构建大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     */
    public static void adjustHeap(int []arr,int i,int length){
        int temp=arr[i];//先取出当前元素
        for(int k=i*2+1;k<length;k=k*2+1){//从i节点的左节点开始，也就是2i+1处开始
            if(k+1<length&&arr[k]<arr[k+1]){//如果左节点小于右节点，k指向右子节点
                k++;
            }
            if(arr[k]>temp){//如果子节点大于父节点，将子节点赋给父节点（不用进行交换）
                 arr[i]=arr[k];
                 i=k;
            }else{
                break;
            }
        }
        arr[i]=temp;//将temp值放到最终的位置
    }

    /**
     * 交换元素
     */
    public static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
