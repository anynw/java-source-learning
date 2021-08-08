package com.wuhp.util;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * 1、ArrayList是可以动态增长和缩减的索引序列，它是基于数组实现的List类。
 * 2、该类封装了一个动态再分配的Object[]数组，每一个类对象都有一个capacity属性，表示它们所封装的Object[]数组的长度，当向ArrayList
 * 中添加元素时，该属性值会自动增加。如果想ArrayList中添加大量元素，可使用ensureCapacity方法一次性增加capacity，可以减少增加重分配的
 * 次数提高性能。
 * 3、ArrayList的用法和Vector向类似，但是Vector是一个较老的集合，具有很多缺点，不建议使用。另外，ArrayList和Vector的区别是：
 * ArrayList是线程不安全的，当多条线程访问同一个ArrayList集合时，程序需要手动保证该集合的同步性，而Vector则是线程安全的。
 * 4、底层的数据结构就是数组，数组元素类型为Object类型，即可以存放所有类型数据。
 * 5、继承结构和层次关系：
 * public class ArrayList<E> extends AbstractList<E>
 *         implements List<E>, RandomAccess, Cloneable, java.io.Serializable
 * @author:Wuhp
 * @createTime:2021/7/28 9:16
 */
public class ArrayListTest {

    public static void main(String[] args) {
        test2();
        systemArrayCopyTest();
        ArrayList<String> strings = new ArrayList<>();
        //System.out.println(8 + (8 >> 1));
        //System.out.println(2>>1);
        //System.out.println(4>>1);
        //System.out.println(128>>1);
        //System.out.println(74>>1);
    }

    /**
     * 未初始化大小，需要扩容
     */
    public static void test1(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
    }

    /**
     * 初始化大小为4，不需要扩容，只有超过了4，才需要grow
     */
    public static void test2(){
        ArrayList<Integer> arr = new ArrayList<>(4);
        arr.add(1);
    }

    /**
     *
     src – 源数组。
     srcPos – 源数组中的起始位置。
     dest – 目标数组。
     destPos – 目标数据中的起始位置。
     length – 要复制的数组元素的数量
     */
    public static void systemArrayCopyTest(){
        String[] arr = {"A","B","C","D","E","F"};
        //原数组：[A, B, C, D, E, F]
        System.out.println("原数组："+ Arrays.toString(arr));
        // 从下标为3的位置开始复制，长度为2，即："D"和"E"元素。
        System.arraycopy(arr ,3,arr,2,2);
        //新数组：[A, B, D, E, E, F]
        System.out.println("新数组：" + Arrays.toString(arr));
    }


    /**
     *add方法调用流程
     * 1、ensureCapacityInternal,确保容量，正常情况下，扩容1.5倍，特殊情况下（新扩展的数组大小达到了最大值）
     * 则只取最大值，如果初始化的elementData为空数组，minCapacity = size+1,minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
     * 所以此处最小的容量又被初始化为10，但是并没有操作数组（elementData = Arrays.copyOf(elementData, newCapacity);），数组还是为空
     * 2、然后调用ensureExplicitCapacity(int minCapacity) 进行判断，如果容量不够，需要扩容
     * 3、然后调用grow(minCapacity)方法进行真正的扩容操作，计算出newCapacity的大小，最后copy数组
     * 改变数组大小：elementData = Arrays.copyOf(elementData, newCapacity);
     * @param e 被添加的元素
     * @return
     */
    public boolean add(Object e) {
        //ensureCapacityInternal(size + 1);  // Increments modCount!!
        //elementData[size++] = e;
        return true;
    }

    /**
     * 在特定的位置插入元素
     * 1、首先检查rangeCheckForAdd(int index),越界则抛出IndexOutOfBoundsException异常
     * 2、ensureCapacityInternal(size + 1);
     * 3、 在插入元素之后，将index之后的元素都往后移一位：
     *  System.arraycopy(elementData, index, elementData, index + 1, size - index);
     * 4、放入元素：elementData[index] = element;
     * 5、数组长度+1：size++;
     * @param index 被添加元素的下标
     * @param e 被添加的元素
     */
    public void add(int index,Object e){

    }



}
