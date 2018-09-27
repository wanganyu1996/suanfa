package com.leetcode;

import java.util.*;

/**
 * 347. Top K Frequent Elements
 */
public class TopKNums {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }

        });
        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        for(Map.Entry<Integer,Integer> entry:set){
            pq.add(entry);
        }
        for(int i=0;i<k;i++){
            list.add(pq.poll().getKey());
        }
        return list;

    }

    class Solution {
        public List<Integer> topKFrequent(int[] nums, int k) {
            List<Integer> list = new ArrayList<>();
            PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue() - o1.getValue();
                }
            });
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
                if (map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
                else map.put(nums[i], 1);
            Set<Map.Entry<Integer, Integer>> set = map.entrySet();
            for (Map.Entry<Integer, Integer> entry : set) pq.add(entry);
            for (int i = 0; i < k; i++) list.add(pq.poll().getKey());
            return list;
        }
    }


}
