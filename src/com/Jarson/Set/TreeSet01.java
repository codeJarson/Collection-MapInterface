package com.Jarson.Set;

import com.Jarson.Map.Employee;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Jarson
 * @create 2019-05-19 20:29
 */
/*
      测试TreeSet的基本使用
            他的底层原理还是TreeMap的使用
       熟悉comparable接口：
                作用：当我们定义一个实体类时，若想输出的值根据某个值进行排序，
                       则需要实现该接口，并实现它当中的CompareTo方法自定义规则
       熟悉增强循环的原理：
                   当中的局部变量由基本类型升成引用类型

 */
public class TreeSet01 {
        public static void main(String[] args){
            Set<Integer> ts1 = new TreeSet<>();
            ts1.add(11);
            ts1.add(22);
            ts1.add(33);
//            通过增强循环遍历该集合
            for(Integer m:ts1){
                System.out.println(m);
            }
            TreeSet<Employee> ts2 = new TreeSet<>();
                Employee e1 = new Employee(10086,"中国移动",100000000);
                Employee e2 = new Employee(10010,"中国电信",1000000000);
                Employee e3 = new Employee(10001,"中国联通",10000000);

            ts2.add(e1);
            ts2.add(e2);
            ts2.add(e3);
            for (Employee e: ts2
                 ) {
                System.out.println(e);
            }
        }

}
