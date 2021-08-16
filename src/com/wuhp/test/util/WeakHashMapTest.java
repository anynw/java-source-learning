package com.wuhp.util;

import java.util.WeakHashMap;

/**
 * @description:WeakHashMap 继承于AbstractMap，实现了Map接口。
 * 1.WeakHashMap 也是一个散列表，它存储的内容也是键值对(key-value)映射，而且键和值都可以是null
 * 2.WeakReference是“弱键”实现的哈希表。它这个“弱键”的目的就是：实现对“键值对”的动态回收。当“弱键”不再被使用到时，GC会回收它，
 * WeakReference也会将“弱键”对应的键值对删除。“弱键”是一个“弱引用(WeakReference)”，在Java中，WeakReference和ReferenceQueue
 * 是联合使用的。在WeakHashMap中亦是如此：如果弱引用所引用的对象被垃圾回收，Java虚拟机就会把这个弱引用加入到与之关联的引用
 * 队列中。 接着，WeakHashMap会根据“引用队列”，来删除“WeakHashMap中已被GC回收的‘弱键’对应的键值对”。另外，理解上面思想的重点
 * 是通过 expungeStaleEntries() 函数去理解。
 * @author:Wuhp
 * @createTime:2021/8/15 22:06
 */
public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap weakHashMap = new WeakHashMap();
    }
}
