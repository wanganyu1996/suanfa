package com.jianzhioffer;

/**
 * 数组中出现次数超过一半的数字
 * Created by wanganyu on 2018/06/10.

链接：https://www.nowcoder.com/questionTerminal/e8a1b01a2df14cb2b228b30ee6a92163
        来源：牛客网
 */


public class Main2 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length==0)
            return 0;
        int middle=array.length>>1;
        int start=0;
        int end=array.length-1;
        int index=Partition(array,start,end);

        while(index!=middle){
            if(index>middle){
                end=index-1;
                index=Partition(array,start,end);
            }
            else{
                start=index+1;
                index=Partition(array,start,end);
            }
        }
        int result=array[middle];
        if(!CheckMoreThanHalf(array,result))
            result=0;
        return result;
    }

    public static boolean CheckMoreThanHalf(int array[],int number){
        int times=0;
        for(int i=0;i<array.length;++i){
            if(array[i]==number)
                times++;
        }
        boolean isMoreThanHalf=true;
        if(times*2<=array.length){
            isMoreThanHalf=false;
        }
        return isMoreThanHalf;
    }
    public static int Partition(int array[],int start,int end){
        int pivotkey=(int)start+(int)Math.random()*(end-start);
        while(start<end){
            while(start<end&&array[end]>=array[pivotkey])
                end--;
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            while(start<end&&array[start]<=array[pivotkey])
                start++;
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
        }
        return start;
    }
    public static int Partition2(int a[],int start,int end){
        int mid=a[start];
        while(start<end){
            while(start<end&&a[end]>=mid){
                end--;
            }
            a[start]=a[end];
            while(start<end&&a[start]<=mid){
                start++;
            }
            a[end]=a[start];
        }
        a[start]=mid;
        return start;
    }
}
/**
 方法二：基于快排的思想
 public class Solution {
 public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
 ArrayList<Integer> list = new ArrayList<Integer>();
 if (input.length < k) {
 return list;
 }
 findKMin(input, 0, input.length - 1, k);
 for (int i = 0; i < k; i++) {
 list.add(input[i]);
 }
 return list;
 }

 public void findKMin(int[] a, int begin, int end, int k) {
 if (begin < end) {
 int pos = partition(a, begin, end);
 if (pos == k - 1) {
 return;
 } else if (pos < k - 1) {
 findKMin(a, pos + 1, end, k);
 } else {
 findKMin(a, begin, pos - 1, k);
 }
 }
 }

 public int partition(int[] a, int begin, int end) {
 int pivot = a[begin];
 while (begin < end) {
 while (begin < end && a[end] >= pivot) {
 end--;
 }
 ;
 a[begin] = a[end];
 while (begin < end && a[begin] <= pivot) {
 begin++;
 }
 ;
 a[end] = a[begin];
 }
 a[begin] = pivot;
 return begin;
 }
 }

**/