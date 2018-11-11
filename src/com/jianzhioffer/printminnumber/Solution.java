package com.jianzhioffer.printminnumber;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if(numbers==null||numbers.length==0){
            return "";
        }
        String nums[]=new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i]=numbers[i]+"";
        }
        Arrays.sort(nums,(s1,s2)->(s1+s2).compareTo(s2+s1));
        String result="";
        for (String s :
                nums) {
            result += s;
        }
        return result;
    }
}
