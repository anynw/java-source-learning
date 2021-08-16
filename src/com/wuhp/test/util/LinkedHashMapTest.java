package com.wuhp.util;

import java.util.LinkedHashMap;

/**
 * @description:
 * 1.LinkedHashMap 继承自 HashMap，在HashMap的基础上，通过维护一条双向链表，解决了 HashMap
 * 不能随时保持遍历顺序和插入顺序一致的问题。除此之外 LinkedHashMap 对访问顺序也提供了相关支持。
 * 在一些场景下，该特性很有用，比如缓存。在实现上， LinkedHashMap 很多方法直接继承自 HashMap，
 * 仅为维护双向链表重写了部分方法
 * 2.LinkedHashMap在HashMap的基础增加了双向链表的结构
 * @author:Wuhp
 * @createTime:2021/8/14 12:58
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        System.out.println();
        new LinkedHashMap<String,Object>();
    }
}
