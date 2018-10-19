package com.leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 *
 * https://github.com/crossoverJie/JCSprout
 * https://github.com/crossoverJie/JCSprout/blob/master/src/main/java/com/crossoverjie/algorithm/TwoSum.java#L38-L59
 *
 * https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&ch=&tn=91003609_hao_pg&bar=&wd=crossoverjie&oq=algorithm&rsv_pq=a51b30850005f4ae&rsv_t=10bdemkjJGSBIrr9HJRsTTD9sVOJUi1KlANMmHapMbBXJ%2BUkLsNsqTQKb7%2FALcw69%2B6N2y%2F9&rqlang=cn&rsv_enter=0&inputT=1322
 *
 *
 * https://leetcode-cn.com/problems/two-sum/description/
 * https://leetcode-cn.com/articles/two-sum/
 *
 * https://blog.csdn.net/qq_28618765/article/details/65946627?utm_source=debugrun&utm_medium=referral
 * https://blog.csdn.net/wz2292667460/article/details/79358044
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap ();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum4(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap ();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * public int[] twoSum(int[] nums, int target) {
     *     for (int i = 0; i < nums.length; i++) {
     *         for (int j = i + 1; j < nums.length; j++) {
     *             if (nums[j] == target - nums[i]) {
     *                 return new int[] { i, j };
     *             }
     *         }
     *     }
     *     throw new IllegalArgumentException("No two sum solution");
     * }
     */
}