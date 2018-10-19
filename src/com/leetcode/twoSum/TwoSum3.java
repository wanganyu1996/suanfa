package com.leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

 class twoSum3 {
    public static int[] twoSum(int[] nums, int target, int temp) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {

                if (map.get(target - nums[i]) > i) {
                    System.out.println("*************"+i);
                    result[0] = i;
                    result[1] = map.get(target - nums[i]);
                } else {

                    result[1] = i;
                    result[0] = map.get(target - nums[i]);
                }
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        //  3,0
        //  2,1
        //  1
        int target = 9;
        int[] result = new int[2];
        result = twoSum(nums, target, 1);
        System.out.println(result[0] + " " + result[1]);
    }
}


