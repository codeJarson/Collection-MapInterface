package com.Jarson.com.Jarson.Iterator;

import java.util.*;

/**
 * @author Jarson
 * @create 2019-05-19 20:59
 */

/*
      迭代器的常用使用方法 ：
            1.通过迭代器来遍历List
                通过list的对象取得迭代器
                通过循环，调用iterator的hasNext（），判断数组是否有下一个，有，则输出next（），值
            2.通过迭代器来遍历Set
            3.通过迭代器来遍历Map

 */
public class TestIterator {


    public static void main(String[] args){
        //通过迭代器来遍历List
        List<Integer> list1= new ArrayList<>();
                list1.add(11);
                list1.add(22);
                list1.add(33);
        Iterator<Integer> iterator1 = list1.iterator();
            while(iterator1.hasNext()){
                System.out.println(iterator1.next());
            }
        //通过  迭代器来遍历Set
        HashSet<Integer> set1 = new HashSet<>();
            set1.add(44);
            set1.add(55);
            set1.add(66);
        Iterator<Integer> iterator2 = set1.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        //通过迭代器来遍历Map
                //第一种方式
        Map<Integer,String> map1 = new HashMap<>();
                    map1.put(77,"琪琪");
                    map1.put(88,"爸爸");
                    map1.put(99,"舅舅");
        Set<Integer> keySet = map1.keySet();//通过keySet（）取得键
        Iterator<Integer> iterator3 = keySet.iterator();//通过键的迭代器遍历容器
            while(iterator3.hasNext()){
                          int key =   iterator3.next();
                System.out.println(key+"---"+map1.get(key));
            }
                //第二种方式
                    HashMap<Integer,String> map2 = new HashMap<>();
                            map2.put(1010,"意林意林");
                            map2.put(1111,"咦咦咦咦");
                            map2.put(1212,"一二一二");
        Set<Map.Entry<Integer, String>> ss = map2.entrySet();   //通过entrySet方法取得一个入口
        Iterator<Map.Entry<Integer, String>> iterator4 = ss.iterator();//通过入口的迭代器来遍历map
                while(iterator4.hasNext()){
                    Map.Entry<Integer, String> value = iterator4.next();//返回的是节点对象
                    System.out.println(value);
                }
    }

}
