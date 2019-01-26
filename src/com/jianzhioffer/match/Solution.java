package com.jianzhioffer.match;

public class Solution {
    public boolean match(char[] str, char[] pattern) {
       if(str==null||pattern==null){
           return false;
       }
       int strIndex=0,patternIndex=0;
       return matchCore(str,strIndex,pattern,patternIndex);
    }
    public boolean matchCore(char[] str,int strIndex,char[] pattern,int patternIndex){
        if(str.length==strIndex&&pattern.length==patternIndex){
            return true;
        }
        if(str.length!=strIndex&&pattern.length==patternIndex){
            return false;
        }
        if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*'){
            if((strIndex!=str.length&&pattern[patternIndex]==str[strIndex])||(strIndex!=str.length&&pattern[patternIndex]=='.')) {
                return matchCore(str, strIndex + 1, pattern, patternIndex + 2)
                        || matchCore(str, strIndex, pattern, patternIndex + 2)
            ||matchCore(str,strIndex+1,pattern,patternIndex);

            }else{
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
        }
        if((strIndex!=str.length&&pattern[patternIndex]==str[strIndex])||(strIndex!=str.length&&pattern[patternIndex]=='.')){
            return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
        }
        return false;
    }
}
