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