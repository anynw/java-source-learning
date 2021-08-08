package com.wuhp.util;

/**
 * @description:继承AbstractCollection，实现了List接口的一些方法。
 * AbstractList是List的骨架实现
 * 1、唯一构造器.(通常由子类构造函数隐式调用,因为protected修饰,且无参数,所以可以被子类使用)
 * 2、2个私有内部类：Itr，ListItr。Itr实现了Iterator接口；ListItr继承了Itr，且实现了ListIterator接口。
 * 3、2个辅助类：SubList，RandomAccessSubList。其中SubList扩展了AbstractList；而RandomAccessSubList扩展了SubList，实现了接口RandomAccess
 * @author:Wuhp
 * @createTime:2021/8/7 21:52
 */
public class AbstractListTest {
    public static void main(String[] args) {
        AbstractListTest abstractListTest = new AbstractListTest();
        System.out.println();
    }
}
