package com.test;

/**
 * 堆排序
 * Created by wanganyu on 2018/04/30.
 */
public class HeapSort {
    public static void main(String[] args){
        //int a[]={9,4,5,63,3,7,8,3};
       int a[]={12,4332,45,5,6,45,66,66,8,99,54,21};
        for(int i=a.length/2-1;i>=0;i--){
            adjustHeap(i,a.length,a);
        }
        for(int i=a.length-1;i>=0;i--){
            swap(a,0,i);
            adjustHeap(0,i,a);
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void adjustHeap(int i,int length,int[] a){
        int temp=a[i];
        int k;
        for( k=2*i+1;k<length;k=k*2+1){
             if(k+1<length&&a[k]<a[k+1]){
                 k++;
             }
             if(temp<a[k]){
                 a[i]=a[k];
                 i=k;
             }else {
                 break;
             }
        }
        a[i]=temp;
    }
    public static void swap(int arr[],int a,int b){
      int t=arr[a];
      arr[a]=arr[b];
      arr[b]=t;
    }
}
