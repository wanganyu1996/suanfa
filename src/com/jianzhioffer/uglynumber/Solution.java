package com.jianzhioffer.uglynumber;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<0){
            return index;
        }
        if(index==1){
            return 1;
        }
        int arr[] = new int[index];
        arr[0]=1;
        int count=1,two=0,three=0,five=0;
        while(count<index){
            int num = Math.min(arr[two]*2, Math.min(arr[three]*3, arr[five]*5));
            if(num==arr[two]*2) {
                two++;
            }
            if(num==arr[three]*3){
                three++;
            }
            if(num==arr[five]*5){
                five++;
            }
            arr[count]=num;
            count++;
        }
        return  arr[count-1];
    }


   /* int GetUglyNumber_Solution(int index) {
        if (index<=0) return 0;
        if (index==1) return 1;
        vector<int>k(index);k[0]=1;
        int t2=0,t3=0,t5=0;
        for (int i=1;i<index;i++) {
            k[i]=min(k[t2]*2,min(k[t3]*3,k[t5]*5));
            if (k[i]==k[t2]*2) t2++;
            if (k[i]==k[t3]*3) t3++;
            if (k[i]==k[t5]*5) t5++;
        }
        return k[index-1];
    }*/
}
