package com.jianzhioffer.isNumeric;

public class Solution {
    public boolean isNumeric(char[] str) {
      boolean sign=false,decimal=false,hasE=false;
        for (int i = 0; i < str.length; i++) {
            if(str[i]=='e'||str[i]=='E'){
                if(i==str.length-1){
                    return false;
                }
                if(hasE){
                    return false;
                }
                hasE=true;
            }else if(str[i]=='+'||str[i]=='-'){
                if(sign&&str[i-1]!='e'&&str[i-1]!='E'){
                    return false;
                }
                if(!sign&&i>0&&str[i-1]!='e'&&str[i-1]!='E'){
                    return false;
                }
            }else if(str[i]=='.'){
                if(hasE||decimal){
                    return false;
                }
                decimal = true;
            }else if(str[i]<'0'||str[i]>'9'){
                return false;
            }
        }
        return true;
    }
}
