package com.Jarson.Map;

/**
 * @author Jarson
 * @create 2019-05-19 10:15
 */
public class TestHashMap {

    public static void main(String[] args){
        int hashCode = 258;   //哈希码
        int length = 16   ;         //注：该长度是数组的长度，且必须是2的整数幂
        myHash(hashCode,length);
    }

    public static void myHash(int hashCode, int length){
        System.out.println(hashCode&(length-1));    //对length取模
        System.out.println(hashCode%length);        //取余数

    }
}
