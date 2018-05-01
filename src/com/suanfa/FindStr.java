package com.suanfa;
/**
编写一个高效率函数来找出一个字符串中第一个无重复字符.例如:”total”中的o,”teeter”中的r.
要求算法效率优于O(n2).
 字符串由26个字母组成，判断是否有重复字符
 给一个字符串，由26个英文字母组成，判断其中有没有重复出现的元素，有返回true，没有返回false。
 https://blog.csdn.net/u012566690/article/details/48241615
**/
/**
 * Created by wanganyu on 2018/04/28.
 */
public class FindStr {
    public static  char findStr(char str[]){
        int p[]=new int[256];
        int i,j;
        for(i=0;i<256;i++){
            p[i]=0;
        }
        i=0;
        while (str[i]!='0'){
            p[str[i]]++;
            i++;
        }
        for(i=0;str[i]!='0';i++){
            if(p[str[i]]==1){
                return str[i];
            }
        }
        return 0;
    }

    /**
     * 声明一个26位的数组，初始化为0，然后遍历字符串，首次出现修改对应数组为1，
     * 检测到对应数组值为1的时候，返回false。成功遍历完毕，返回true。代码如下：
     * @param str
     * @return
     */
    public static boolean isUniqueStr(String str){
        int a[]=new int[26];
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            if(a[index]==1){
                return false;
            }
            a[index]=1;
        }
        return true;
    }
    public static boolean isUniqueChar(String str) {
        int checker = 0;//检测标志
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) -'a';//val 字符对应的位运算整形数，每个字母对应唯一的一个
            if ((checker & (1 << val)) > 0) return false;// (1 << val)进行位运算，得出该字母的唯一值，进行与判断
            checker |= (1 << val);//第一次出现，进行异或累加操作
        }
        return true;
    }
    public static void main(String[] args){
      String str="qwe";
      char[] p= str.toCharArray();
      // char c=findStr(p);
      // System.out.println(c);
        System.out.println(isUniqueStr(str));
    }
}
