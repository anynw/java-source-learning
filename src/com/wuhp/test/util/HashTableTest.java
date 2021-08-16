package com.wuhp.util;

import java.util.Hashtable;

/**
 * @description:
 *  1.Hashtable的默认容量为11，默认负载因子为0.75.(HashMap默认容量为16，默认负载因子也是0.75)
 *  2.Hashtable的容量可以为任意整数，最小值为1，而HashMap的容量始终为2的n次方。
 *  3.为避免扩容带来的性能问题，建议指定合理容量。
 *  4.跟HashMap一样，Hashtable内部也有一个静态类叫Entry，其实是个键值对对象，保存了键和值的引用。
 *  5.HashMap和Hashtable存储的是键值对对象，而不是单独的键或值。
 *  6.HashTable里所有的方法都是线程安全的，通过synchronized关键字修饰。
 *  7.HashTable的key和value都不可以为空，为空则会抛空指针异常。
 *  8.Hashtable每次扩容，容量都为原来的2倍加1，而HashMap为原来的2倍。
 *  9.HashMap计算索引的方式是h&(length-1),而Hashtable用的是模运算，效率上是低于HashMap的。
 * @author:Wuhp
 * @createTime:2021/8/9 22:31
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable<String, Object> stringObjectHashtable = new Hashtable<>();
        System.out.println(0x7FFFFFFF);
    }
}
