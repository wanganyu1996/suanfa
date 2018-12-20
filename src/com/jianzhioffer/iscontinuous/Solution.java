package com.jianzhioffer.iscontinuous;

import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null||numbers.length<=0) {
            return false;
        }
        int numberOfZero = 0;
        for (int num : numbers) {
            if (0 == num) {
                numberOfZero++;
            }
        }
        Arrays.sort(numbers);
        int small = numberOfZero;
        int big = small + 1;
        int numberOfGap=0;
        while(big<numbers.length){
            if(numbers[small]==numbers[big]){
                return false;
            }
            numberOfGap += numbers[big] - numbers[small] - 1;
            small=big;
            big++;
        }
        return numberOfGap <= numberOfZero;
    }
}
