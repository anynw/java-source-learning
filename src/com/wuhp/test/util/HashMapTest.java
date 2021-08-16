package com.wuhp.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @description:
 * 概括的说，HashMap 是一个关联数组、哈希表，它是线程不安全的，允许key为null,value为null。遍历时无序。
 * 其底层数据结构是数组称之为哈希桶，每个桶里面放的是链表，链表中的每个节点，就是哈希表中的每个元素。
 * 在JDK8中，当链表长度达到8，会转化成红黑树，以提升它的查询、插入效率，它实现了Map<K,V>, Cloneable, Serializable接口。
 * 1、单链表，每一个节点的hash值都是通过key的hashcode和value的hashcode通过异或运算得到
 * 2、最大容量 1<<30 （2的30次幂）static final int 修饰
 * 3、默认的负载因子 static final float DEFAULT_LOAD_FACTOR = 0.75f;
 * 4、哈希桶，存放链表，长度为2的N次幂，初始化为0，源码中名称为table，transient修饰
 * 5、阈值 threshold  = table.length * loadFactor
 * 6、增删改查方法为重点
 * @author:Wuhp
 * @createTime:2021/8/8 20:18
 */
public class HashMapTest {
    public static void main(String[] args) {
        int a = 0;
        System.out.println((a=6) != 0);
        //test();
        int cap = 13;
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println(n);
    }

    public static void test(){
        Map<String, Object> map = new HashMap<>();
        map.put(null,"1");
        map.put("2","2");
        System.out.println(map.toString());
        System.out.println(map.get(null));
    }

    /*链表结构（Node）*/
    static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;//哈希值
        final K key;//key
        V value;//value
        Node<K,V> next;//链表后置节点

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey()        { return key; }
        public final V getValue()      { return value; }
        public final String toString() { return key + "=" + value; }

        //每一个节点的hash值，是将key的hashCode 和 value的hashCode 亦或得到的。
        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }
        //设置新的value 同时返回旧value
        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Map.Entry) {
                Map.Entry<?,?> e = (Map.Entry<?,?>)o;
                if (Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue()))
                    return true;
            }
            return false;
        }
    }

}
