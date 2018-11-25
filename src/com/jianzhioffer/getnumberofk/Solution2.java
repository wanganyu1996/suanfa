package com.jianzhioffer.getnumberofk;

public class Solution2 {
    public int GetNumberOfK(int [] array , int k) {
        int number=0;
        if(array!=null&&array.length>0){
            int first = getFirstK(array, array.length, k, 0, array.length - 1);
            int last = getLastK(array, array.length, k, 0, array.length - 1);
           if(first>-1&&last>-1){
               number = last - first + 1;
           }
        }
        return number;
    }
    public int getFirstK(int []data,int length,int k,int start,int end){
        if(start>end)
            return -1;
        int middleIndex = (start + end) / 2;
        int middleData = data[middleIndex];
        if (middleData==k){
           if((middleIndex>0&&data[middleIndex-1]!=k)||middleIndex==0){
               return middleIndex;
           }else{
               end = middleIndex - 1;
           }
        }else if(middleData>k){
            end = middleIndex -1;
        }else{
            start = middleIndex + 1;
        }
        return getFirstK(data, length, k, start, end);
    }
    public int getLastK(int []data,int length,int k,int start,int end){
        if(start>end){
            return -1;
        }
        int middleIndex = (start + end) / 2;
        int middleData = data[middleIndex];
        if(middleData==k){
            if((middleIndex<length-1&&data[middleIndex+1]!=k)||middleIndex==length-1){
                return middleIndex;
            }else{
                start = middleIndex + 1;
            }
        }else if(middleData<k){
            start = middleIndex + 1;
        }else{
            end = middleIndex - 1;
        }
        return getLastK(data, length, k, start, end);
    }
}
