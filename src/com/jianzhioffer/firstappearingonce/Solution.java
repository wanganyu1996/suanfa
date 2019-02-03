package com.jianzhioffer.firstappearingonce;

public class Solution {
    private int occurance[]=new int[256];
    private int index;
    //Insert one char from stringstream

    public Solution() {
        for (int i = 0; i < 256; i++) {
            occurance[i]=-1;
        }
        index=0;
    }

    public void Insert(char ch)
    {
        if(occurance[ch]==-1){
            occurance[ch] = index;
        }else if(occurance[ch]>=0){
            occurance[ch]=-2;
        }
        index++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char ch = '\0';
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if(occurance[i]>=0&&occurance[i]<minIndex){
                ch=(char)i;
                minIndex=occurance[i];
            }
        }
      if(ch=='\0'){
          return '#';
      }
        return ch;
    }
}

