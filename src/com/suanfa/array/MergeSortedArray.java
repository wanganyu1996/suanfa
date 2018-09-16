package com.suanfa.array;

/**
 * 两个有序数组的合并排序
 */
public class MergeSortedArray {

    public static void mergeSorted(int []arr1,int []arr2){
        int length=arr1.length+arr2.length;
        int result[]=new int[length];
        int i=0,j=0,count=0;
        while(i<arr1.length&&j<arr2.length){
           if(arr1[i]<=arr2[j]){
                result[count++]=arr1[i];
                i++;
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
      int arr2[]={0,3,4,5,11,14,18,21,31};
      mergeSorted(arr1,arr2);

    }
}
