package com.wuhp.util;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @description:在Java中，ListIterator 是Collection API中的一个接口
 * 1、它扩展了Iterator接口。它是一个双向迭代器
 * 2、它支持向前和向后迭代和CRUD操作
 * 3、它是Iterator唯一的List实现类
 * 4、与Iterator不同，它不适用于整个Collection Api
 * 5、与Spilterator相比，它不支持并行迭代
 * 6、与Spilterator相比，它不支持更好的性能来迭代大量数据
 * 7、Iterator只支持read和delete操作，而ListIterator支持CRUD操作
 * @author:Wuhp
 * @createTime:2021/8/8 12:09
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        //bidirectionalIterationTest();
        addElement();
    }

    // 接口中方法
    // 一、正向迭代方法
    // boolean hasNext();//如果此列表迭代器在向前遍历列表时还有更多元素，则返回true
    // E next();//返回列表中的下一个元素并前移光标位置
    // boolean hasPrevious();//如果此列表迭代器在反向遍历列表时还有更多元素，则返回true
    // 二、反向迭代方法
    // E previous();//返回列表中的上一个元素并向后移动光标位置。
    // int nextIndex();//返回下一个元素的索引
    // int previousIndex();//返回后续调用previous（）返回的元素的索引。

    // void remove();//从列表中删除next（）或previous（）的最后一个元素。
    // void set(E e);//用指定的元素替换next（）或previous（）返回的最后一个元素
    // void add(E e);//将指定的元素插入列表中

    public static void bidirectionalIterationTest(){
        List<String> names = new LinkedList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        ListIterator<String> stringListIterator = names.listIterator();
        // 正向遍历
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }
        // 反向遍历
        while (stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }
    }

    public static void addElement(){
        List<String> names = new LinkedList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add(1,"x");
        System.out.println(names.size());
        names.remove(0);
        System.out.println(names.size());
        names.set(0,"z");
        System.out.println(names.size());
        System.out.println(names.toString());
    }
}
