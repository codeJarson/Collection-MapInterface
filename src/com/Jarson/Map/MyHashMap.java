package com.Jarson.Map;

/**
 * @author Jarson
 * @create 2019-05-19 11:11
 */
/*
    自定义一个HashMap：
        思路：
            1.基本的结构有什么？
             Node[] table;  //位桶数组
            int size;       //数组中节点的个数
            2.我们创建时他的默认长度
               public MyHashMap() {
                table = new Node[16];   //注：数组长度需要为2的整数幂
   }
      新增一个put方法     put（Object key，Object value）
          思路：
            1.当调用时，我们生成了一个新的节点对象，newNode
            2.计算该newNode的hash值
                myHash（）
            3.列出newNode节点中的属性为？？？
            4.做判断，如何将节点放入到相应的数组索引空间中？？？
                根据newNode的hash值，与table【索引】相对应起来，然后放入节点到该table【索引】中
            5.第二种情况：temp！=null，即当中原本有节点的话，则遍历对应链表
               如果key键重复的情况？？？
               key.equals()
               temp.value =value(所传入的value)

               不重复的情况？？？
                       遍历下一个，
                    temp = temp.next;
 */
public class MyHashMap {
    Node[] table;  //位桶数组
    int size;       //数组中节点的个数

    public MyHashMap() {
        table = new Node[16];   //注：数组长度需要为2的整数幂

    }
    public void put(Object key,Object value){
        //当调用时，我们生成了一个新的节点对象
        Node newNode = new Node();
        //计算该newNode的hash值
        newNode.hash = myHash(key.hashCode(),table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;
        Node temp = table[newNode.hash];    //temp = table[索引下标]
        Node iterLast = null;  //正在循环的最后一个元素
        boolean keyRepeat = false;//key键是否重复
        //做判断
        if(temp==null){//当中没有节点的情况
            //如果table[newNode.hash]=table[15]，而这当中为null，则将节点对象放入table【newNode.hash】当中
            table[newNode.hash] = newNode;
        }else{      //第二种情况：temp！=null，即当中原本有节点的话，则遍历对应链表
                while(temp!=null){
                    //判断key键重复的情况
                    if(temp.key.equals(key)){
                        keyRepeat =true;
                        temp.value = value;
                        break;//如何key键重复且替换了value，则后面就不需要执行，执行中断该循环
                    }else{
                        //key键不重复，则遍历下一个
                        iterLast  = temp;//假设它是每次循环的最后一个元素

                        temp = temp.next;
                    }
                }
                if(!keyRepeat){     //key键不重复的情况
                    iterLast.next = newNode;//相当于在该最后元素链接新的节点

                }
                size++;
        }
    }
    //计算hash值得方法
    public static int myHash(int hashCode, int length){
        //System.out.println(hashCode&(length-1));    //位运算
        //System.out.println(hashCode%length);        //取余数
        return hashCode&(length-1);
    }
    public static void main(String[] args){
        MyHashMap hm1 = new MyHashMap();
        hm1.put(1,"Jarson1");
        hm1.put(2,"Jarson2");
        hm1.put(3,"Jarson3");
        hm1.put(17,"Jarson17"); //hash码相同的情况
        hm1.put(1,"Jarson11");//key键重复的情况
        System.out.println(hm1);
//        for (int i = 0; i <100; i++) {
//            System.out.println(i+"---"+myHash(i,16));//17-1   18--2 19--3
//        }
    }
}
