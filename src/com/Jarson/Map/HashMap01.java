package com.Jarson.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jarson
 * @create 2019-05-18 21:21
 */
/*
    hasMap中的常见用法

 */
public class HashMap01 {
    public static void main(String[] args){
        Map<Integer, Employee> hm1= new HashMap<>();
        Employee e1 = new Employee(1001,"Jarson1",10000);
        Employee e2 = new Employee(1002,"Jarson2",1000);
        Employee e3 = new Employee(1003,"Jarson3",100);
        Map<Integer, Employee> hm2= new HashMap<>();
        Employee e4 = new Employee(1004,"Jarson4",100000);
        Employee e5 = new Employee(1005,"Jarson5",10000);
        Employee e6 = new Employee(1006,"Jarson6",1000);
    //用HashMap当中的put方法成对存放对象
        hm1.put(1001,e1);
        hm1.put(1002,e2);
        hm1.put(1003,e3);
        hm2.put(1004,e4);
        hm2.put(1005,e5);
        hm2.put(1006,e6);

        System.out.println(hm1.get(1002));

        System.out.println(hm1.containsKey(1003));

        System.out.println(hm1.containsValue(e3));

        hm1.putAll(hm2);
        System.out.println(hm1);

        System.out.println(hm1);
    }
}
