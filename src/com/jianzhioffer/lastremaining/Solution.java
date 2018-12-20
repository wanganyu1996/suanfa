package com.jianzhioffer.lastremaining;

import java.util.ArrayList;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index=0;
        while(list.size()>1){
            index = (m-1 +index) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }
}
