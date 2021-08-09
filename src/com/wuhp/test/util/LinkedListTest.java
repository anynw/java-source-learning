package com.wuhp.util;

import java.util.LinkedList;

/**
 * @description:LinkedList是基于链表实现的，所以先讲解一下什么是链表。链表原先是C/C++的概念，
 * 是一种线性的存储结构，意思是将要存储的数据存在一个存储单元里面，这个存储单元里面除了存放有待存储的数据以外，
 * 还存储有其下一个存储单元的地址（下一个存储单元的地址是必要的，有些存储结构还存放有其前一个存储单元的地址），
 * 每次查找数据的时候，通过某个存储单元中的下一个存储单元的地址寻找其后面的那个存储单元。
 * 1、LinkedList是一个双向链表
 * 2、也就是说list中的每个元素，在存储自身值之外，还 额外存储了其前一个和后一个元素的地址，所以 也就可以
 * 很方便地根据当前元素获取到其前后的元素
 * 3、链表的尾部元素的后一个节点是链表的头节点；而链表的头结点前一个节点则是则是链表的尾节点
 * 4、既然是一个双向链表，那么必然有一个基本的存储单元，让我们来看LinkedList的最基础的存储单元
 * 5、LinkedList和ArrayList的区别
 * ArrarList查询和获取快，修改和删除慢。LinkedList修改和删除快，查询和获取慢
 * 6、数据特点：可以为空，有序，允许重复，线程不安全
 * @author:Wuhp
 * @createTime:2021/8/8 11:58
 */
public class LinkedListTest {
    public static void main(String[] args) {
        //LinkedList
        System.out.println();
    }


    // 一个私有的内部类
    private static class Node<E> {
        E item;      // 真正存储的数据
        Node<E> next;  // 前一个节点引用地址
        Node<E> prev;  // 后一个节点引用地址

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    // LinkedList几个重要的private方法，需要单独分析
    /**
     * LinkedList集合中有哪些元素
     * 1、size：用来记录LinkedList的大小，transient int size = 0;
     * 2、Node first：用来表示LinkedList的头节点，transient Node<E> first;
     * 3、Node last：用来表示LinkedList的尾节点，transient Node<E> last;
     */

}
