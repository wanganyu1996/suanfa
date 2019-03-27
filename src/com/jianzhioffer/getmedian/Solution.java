package com.jianzhioffer.getmedian;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    int count = 0;
    public void Insert(Integer num) {
        //偶数
       if(count%2==0){
           maxHeap.offer(num);
           int max=maxHeap.poll();
           minHeap.offer(max);
       }else{
           //奇数
           minHeap.offer(num);
           int min = minHeap.poll();
           maxHeap.offer(min);
       }
        ++count;
    }

    public Double GetMedian() {
         if(count%2==0){
             return new Double((minHeap.peek() + maxHeap.peek())) / 2;
         }else{
             return new Double(minHeap.peek());
         }
    }
}
