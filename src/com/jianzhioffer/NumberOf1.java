package com.jianzhioffer;

public class NumberOf1 {
    /**
     * 死循环代码
     * @param n
     * @return
     */
   public static  int NumberOf1(int n){
        int count=0;
        int p=0;
        while(n!=0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;

    }
    public static  int NumberOf1_2(int n){
        int count=0;
        int flag=1;
        int p=0;
        while(flag!=0){
            ++p;
            System.out.println("++"+count+"///"+flag);
            if((n&flag)!=0){

                count++;
            }
            flag=flag<<1;
        }
        System.out.println("次数"+p);
        return count;
    }
    public static  int NumberOf1_3(int n){
        int count=0;
        while(n!=0){
            count++;
            System.out.println("**"+count);
           n=n&(n-1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(NumberOf1_2(1));
       // System.out.println(NumberOf1_3(1556));
    }

}
