package com.jianzhioffer.inversepairs;

public class Solution {
    public int InversePairs(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        int count=InversePairsCode(array,copy,0,array.length-1);
        return count;
    }
    int InversePairsCode(int []arr,int []copy,int start,int end){
        if(start==end)
            return 0;
        int mid = (start + end) / 2;
        int left = InversePairsCode(arr, copy, start,  mid)%1000000007;
        int right = InversePairsCode(arr, copy,mid+1, end)%1000000007;
        int i=mid;
        int j=end;
        int count=0;
        int indexCopy=end;
        while(i>=start&&j>mid){
            if(arr[j]<arr[i]){
                copy[indexCopy--]=arr[i--];
                count += (j -mid);
                if(count>1000000007){
                    count = count % 1000000007;
                }
            }else{
                copy[indexCopy--] = arr[j--];
            }
        }
        while(i>=start){
            copy[indexCopy--]=arr[i--];
        }
        while(j>mid){
            copy[indexCopy--] = arr[j--];
        }
        for (int m=start;m<=end;m++){
            arr[m] = copy[m];
        }
        return (left + count + right)%1000000007;
    }
}
