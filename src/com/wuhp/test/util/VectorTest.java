package com.wuhp.util;

import java.util.Vector;

/**
 * @description:
 * 1.vector默认构造不给分配内存，所以resize()时，从0-》1-》2-》4...，很明显这样的前期扩容方式效率特别的低。
 * 解决办法：reserve(num);提前开辟好num个大小的空间，避免前期多次扩容，多次调用构造析构函数
 * 和resize()的区别：resize既开辟空间又调用构造和析构函数，并且还要将旧数组中的元素拷贝到新数组。
 * 2.操作vector其实就是在操作一个数组，对于数组的话，无论是中间插入/删除，效率都特别低。因为每次增加或者删除后都
 * 需要挪动后面的，可能造成迭代器失效的问题。但是尾插不会有这样的状况，而且vector不会提供push_front方法。
 * 3.由于提供了[]运算符重载函数，所以用下标访问元素使得效率特别高。
 * 4.对于接口swap()：如果自交换，什么都不做；如果交换相同类型，只需要交成员变量就可以；如果交换类型不同，
 * 那么效率会特别的低。
 * 5、总结：vector适合用于经常访问查询的场景，不适合经常需要增加删除的场景。
 * @author:Wuhp
 * @createTime:2021/8/14 19:37
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("1");
        System.out.println(strings.toString());
        System.out.println(strings.get(0));
        strings.add("2");
        System.out.println(strings.toString());
        strings.remove("1");
        System.out.println(strings.toString());
    }
}
