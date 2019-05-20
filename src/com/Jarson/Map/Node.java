package com.Jarson.Map;

/**
 * @author Jarson
 * @create 2019-05-19 11:11
 */
/*
      节点实体类
            1.hash
            2.key
            3.value
            4.next
 */
public class Node<K,V> {
    public int hash;
    public K key;
    public V value;
    public Node next;

    public Node() {
    }

    public Node(int hash, K key, V value, Node next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

}
