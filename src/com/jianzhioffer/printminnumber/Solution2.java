package com.jianzhioffer.printminnumber;

import java.util.*;

public class Solution2 {
    public String PrintMinNumber(int [] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                String s1=o1+""+o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            s += list.get(i);
        }
        return s;
    }
    public static void main(String[] args) {

    }
}
