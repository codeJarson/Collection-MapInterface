package com.Jarson.com.Jarson.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Jarson
 * @create 2019-05-20 13:00
 */
/*
    表格数据的存储
    ORM思想：把一组数据看成一个对象，存放在List或Map中

 */
public class ORM {
//    容器间的相互使用
    public static void main(String[] args){
        test();

            HashMap<Object, Object> map1 = new HashMap<>();
                map1.put("id:","1001");
                map1.put("姓名：","Jarson");
        Set<Object> keyS = map1.keySet();
        for(Object k :keyS){
            System.out.print(k+""+map1.get(k)+"\t");

        }

        ArrayList<HashMap<Object, Object>> list1 = new ArrayList<>();
                    list1.add(map1);
        for (HashMap<Object, Object> map : list1) {
            System.out.println(map);
        }


    }




    public static void test(){
        User u1 = new User(10086,"中国移动",1000000000000000000.0);
        User u2 = new User(10001,"中国电信",1000000000000000001.0);
        User u3 = new User(10010,"中国联通",1000000000000000010.0);
        ArrayList<User> list2 = new ArrayList<>();
            list2.add(u1);
            list2.add(u2);
            list2.add(u3);

        for (User u: list2
             ) {
            System.out.println(u);
        }
    }
}



