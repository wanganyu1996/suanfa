package com.jianzhioffer;

/**
 * 剑指offer 第四章 字符串全排列
 * Created by wanganyu on 2018/06/05.
 */
public class Main {

    private  static void permutation(char[] pStr,int pBegin){

        if(pBegin==pStr.length-1){
              System.out.println(String.valueOf(pStr));
        }else{
            for(int i=pBegin;i<pStr.length;i++){
                char t=pStr[pBegin];
                pStr[pBegin]=pStr[i];
                pStr[i]=t;
                permutation(pStr,pBegin+1);
                 t=pStr[pBegin];
                pStr[pBegin]=pStr[i];
                pStr[i]=t;
            }
        }

    }
    public static void main(String[] args) {
        permutation("abcd".toCharArray(),0);
    }
}
