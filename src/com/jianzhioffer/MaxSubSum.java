package com.jianzhioffer;

/**
 * 连续子数组的最大和
 */
public class MaxSubSum {
    /*
  求三个数中的最大值
  */
    int MaxSubSum(int arr[],int len)
    {
        int i;
        int MaxSum = 0;
        int ThisSum= 0;
        for(i=0;i<len;i++)
        {
            ThisSum+= arr[i];
            if(ThisSum > MaxSum)
                MaxSum = ThisSum;
        /*如果累加和出现小于0的情况，
           则和最大的子序列肯定不可能包含前面的元素，
           这时将累加和置0，从下个元素重新开始累加  */
            else if(ThisSum< 0)
                ThisSum= 0;
        }
        return MaxSum;
    }
    static int Max3(int a,int b,int c)
    {
        int Max = a;
        if(b > Max)
            Max = b;
        if(c > Max)
            Max = c;
        return Max;
    }


    static  int MaxSubSum2(int arr[],int left,int right)
    {
        int MaxLeftSum,MaxRightSum;    //左右边的最大和
        int MaxLeftBorderSum,MaxRightBorderSum;    //含中间边界的左右部分最大和
        int LeftBorderSum,RightBorderSum;    //含中间边界的左右部分当前和
        int i,center;

        //递归到最后的基本情况
        if(left == right)
            if(arr[left]>0)
                return arr[left];
            else
                return 0;

        //求含中间边界的左右部分的最大值
        center = (left + right)/2;
        MaxLeftBorderSum = 0;
        LeftBorderSum = 0;
        for(i=center;i>=left;i--)
        {
            LeftBorderSum += arr[i];
            if(LeftBorderSum > MaxLeftBorderSum)
                MaxLeftBorderSum = LeftBorderSum;
        }
        MaxRightBorderSum = 0;
        RightBorderSum = 0;
        for(i=center+1;i<=right;i++)
        {
            RightBorderSum += arr[i];
            if(RightBorderSum > MaxRightBorderSum)
                MaxRightBorderSum = RightBorderSum;
        }

        //递归求左右部分最大值
        MaxLeftSum = MaxSubSum2(arr,left,center);
        MaxRightSum = MaxSubSum2(arr,center+1,right);

        //返回三者中的最大值
        return Max3(MaxLeftSum,MaxRightSum,MaxLeftBorderSum+MaxRightBorderSum);
    }

    /*
    将分支策略实现的算法封装起来
    */
   public static int MaxSubSum2_1(int arr[],int len)
    {
        return MaxSubSum2(arr,0,len-1);
    }

    public static void main(String[] args) {
        //int arr[]={2,4,-7,5,2,-1,2,-4,3};
        int arr[]={1,-2,3,10,-4,7,2,-5};
        System.out.println(MaxSubSum2_1(arr,arr.length));
    }
}
