package com.suanfa;

/**
 * 2018阿里秋招在线编程题（Java开发工程师）
 题目：小猴子下山，沿着下山的路有一排桃树，每棵树都结了一些桃子。小猴子想摘桃子，但是又一些条件需要遵守，小瘦子只能沿着下山的方向走，不能回头，
 每棵树最多摘一个，而且一旦摘了一棵树的桃子，就不能再摘比这棵树结的桃子少的树上的桃子，那么小猴子最多能摘到几课桃子呢？
 距离说明，比如有五棵树，分别结了10，4，5，12，8棵桃子，那么小猴子最多能摘3颗桃子，来自于结了4，5，12颗桃子的桃树。
 输入范例：
 5
 10
 4
 5
 12
 8
 输出范例：
 3
 */

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int count=input.nextInt();
        int nums[]=new int[count];
        for(int i=0;i<count;i++){
            nums[i]=input.nextInt();
        }
        int max[]=new int[count];
        for(int j=0;j<count;j++){
            max[j]=1;
            for(int k=0;k<j;k++){
                if(max[k]+1>max[j]&&nums[k]<nums[j]){
                    max[j]=max[k]+1;
                }
            }
        }
        int maxPeach=1;
       for(int m=0;m<count;m++){
           if(maxPeach<max[m]){
               maxPeach=max[m];
           }
       }
        System.out.println(maxPeach);
    }
}
