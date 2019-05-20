package com.Jarson.Set;



import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Jarson
 * @create 2019-05-19 16:17
 */
/*
    手工实现一个hashSet类

 */
public class MySet {

HashMap map;
private static final Object PRESENT = new Object();

    public MySet() {
        map = new HashMap();
    }


    public void add(Object key){
        map.put(key,PRESENT);
    }
    public int size(){
        return map.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Object key : map.keySet()){
            sb.append(key+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }
        public static void main(String[] args){
            MySet ms1 = new MySet();
            ms1.add(11);
            ms1.add(22);
            ms1.add(33);
            System.out.println(ms1);

    }
}
