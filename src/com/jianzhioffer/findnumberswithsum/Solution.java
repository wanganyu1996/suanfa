package com.jianzhioffer.findnumberswithsum;

import java.util.*;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {

        int arr[] = new int[2];
        Map map = new HashMap<Integer, Integer>();
        int flag = -1;
        for (int i = 0; i < array.length; i++) {
            int target = sum - array[i];
            if (map.containsKey(target) && !map.get(target).equals(i)) {
                int num = (int) map.get(target);
                if (flag == -1) {
                    arr[0] = target;
                    arr[1] = array[i];
                    flag = 1;
                }
                if (target < arr[0]) {
                    arr[0] = target;
                    arr[1] = array[i];
                }
            }
            map.put(array[i], i);
        }
        ArrayList list = new ArrayList<Integer>();
        if (flag != -1) {
            list.add(arr[0]);
            list.add(arr[1]);
        }
        return list;
    }
}
