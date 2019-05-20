package com.Jarson.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Jarson
 * @create 2019-05-20 12:31
 */
/*
    Collections是辅助类
    而Collection是接口

 */
public class TestCollections {
        public static void main(String[] args){
            ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(11);
                        list1.add(22);
                        list1.add(33);
                        Collections.shuffle(list1);//将数组中的元素随机顺序输出
                        System.out.println(list1);
                        Collections.reverse(list1);//使当中的元素倒序
                        System.out.println(list1);

        }

}
