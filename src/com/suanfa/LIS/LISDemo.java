package com.suanfa.LIS;

public class LISDemo {

    public  static int lis(int arr[]){
        if(arr==null||arr.length==0){
               return 0;
        }
        int length=arr.length;
        int res[]=new int[length];
        for(int i=0;i<length;i++){
            res[i]=1;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]&&res[j]+1>res[i]){
                    res[i]=res[j]+1;
                }
            }
        }
        int max=res[0];
        for(int i=0;i<res.length;i++){
            if(max<res[i]){
                max=res[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,1,5,9,2,6,5};
        int[] a = {100, 4, 200, 1, 3, 2};
        int result = lis(a);
        System.out.println(result);
    }
}
