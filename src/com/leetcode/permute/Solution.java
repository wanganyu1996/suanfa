package com.leetcode.permute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            data.add(nums[i]);
        }
        permutehelper(data, 0, result);
        return result;

    }
    public void permutehelper(List<Integer> data,int index,List<List<Integer>> result){
       if(index==data.size()-1){
           result.add(new ArrayList<Integer>(data));
           return;
       }
        for (int i = index; i <data.size() ; i++) {
            Collections.swap(data,index,i);
            permutehelper(data, index + 1, result);
            Collections.swap(data,index,i);
        }
    }
}
