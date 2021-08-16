package com.wuhp.util;

import java.util.*;

/**
 * @description:
 * 1.SortedSet 是“根据对象的比较顺序”，而不是“插入顺序”进行排序
 * 1.SortedSet 的实现不是同步的，不是线程安全的
 * @author:Wuhp
 * @createTime:2021/8/15 10:57
 */
public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("watermelon");

        System.out.println("SortedSet: " + fruits);
        System.out.println("SortedSet First: " + fruits.first());
        System.out.println("SortedSet Last: " + fruits.last());

        // 获取 orange(不包含) 之前的元素
        SortedSet<String> beforeOrange = fruits.headSet("orange");
        System.out.println("获取 orange(不包含) 之前的元素：" + beforeOrange);

        // 获取 apple (包含) 和 watermelon (不包含) 之间的元素
        SortedSet<String> betweenAppleAndWatermelon = fruits.subSet("apple", "watermelon");
        System.out.println("获取 apple (包含) 和 watermelon (不包含) 之间的元素：" + betweenAppleAndWatermelon);

        // 获取 banana (包含) 之后的元素
        SortedSet<String> afterCode = fruits.tailSet("banana");
        System.out.println("获取 banana (包含) 之后的元素：" + afterCode);

    }
    public static void test(){
        new SortedSet() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public Comparator comparator() {
                return null;
            }

            @Override
            public SortedSet subSet(Object fromElement, Object toElement) {
                return null;
            }

            @Override
            public SortedSet headSet(Object toElement) {
                return null;
            }

            @Override
            public SortedSet tailSet(Object fromElement) {
                return null;
            }

            @Override
            public Object first() {
                return null;
            }

            @Override
            public Object last() {
                return null;
            }
        };
    }

}
