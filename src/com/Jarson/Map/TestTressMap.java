package com.Jarson.Map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Jarson
 * @create 2019-05-19 15:35
 */
public class TestTressMap {
    public static void main(String[] args){
        Map<Employee, String> tm1 = new TreeMap<>();

        Employee e1 = new Employee(666,"Jarson",500000);
        Employee e2 = new Employee(12138,"Mike",50000);
        Employee e3 = new Employee(233,"Gogo",5000);
        Employee e4 = new Employee(233,"Gogo2",5001);
            tm1.put(e1,"大牛");
            tm1.put(e2,"红牛");
            tm1.put(e3,"辣鸡");
            tm1.put(e4,"辣鸡");
        //System.out.println(tm1);
        //按照key递增的方法输出
        for(Employee key:tm1.keySet()){
            System.out.println(key+"---"+tm1.get(key));
        }
    }
}
