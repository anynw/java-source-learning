package com.wuhp.util;

/**
 * @description:
 * 集合框架是一个用来代表和操纵集合的统一架构。所有的集合框架都包含如下内容：
 * 1、接口：是代表集合的抽象数据类型。例如 Collection、List、Set、Map 等。之所以定义多个接口，是为了以不同的方式操作集合对象
 * 2、实现（类）：是集合接口的具体实现。从本质上讲，它们是可重复使用的数据结构，例如：ArrayList、LinkedList、HashSet、HashMap。
 * 3、算法：是实现集合接口的对象里的方法执行的一些有用的计算，例如：搜索和排序。这些算法被称为多态，那是因为相同的方法可以在相似的接口上有着不同的实现。
 * 4、AbstractCollection抽象类要求子类必须实现两个方法，iterator()和size()。
 * @author:Wuhp
 * @createTime:2021/8/7 20:19
 */
public  class AbstractCollectionTest {
    public static void main(String[] args) {
        System.out.println();
    }

    //返回集合中存在的元素。如果元素的数目超过Integer.MAX_VALUE,返回Integer.MAX_VALUE
    //int size();

    //当集合不包含任何元素时，返回true
    //boolean isEmpty();

    //如果集合中包含至少一个指定对象,返回true
    //boolean contains(Object o);

    //返回可以遍历集合元素的迭代器
    //Iterator<E> iterator();

    //返回集合中所有元素组成的数组，数组元素的返回顺序要和迭代器访问集合元素的返回顺序一样
    //Object[] toArray();

    //返回包含此 collection 中所有元素的数组；返回数组的运行时类型与指定数组的运行时类型相同。
    //<T> T[] toArray(T[] a);

    //如果集合不允许重复元素，且集合中已经含有该元素，返回false
    //boolean add(E e);

    //从此 collection 中移除指定元素的单个实例，如果集合中存在指定元素返回true。
    //boolean remove(Object o);

    //如果此 collection 包含指定 collection 中的所有元素，则返回 true。
    //boolean containsAll(Collection<?> c);

    //将指定 collection 中的所有元素都添加到此 collection 中
    //boolean addAll(Collection<? extends E> c);

    //移除此 collection 中那些也包含在指定 collection 中的所有元素（可选操作）。
    //boolean removeAll(Collection<?> c);

    //仅保留此 collection 中那些也包含在指定 collection 的元素（可选操作）。
    //boolean retainAll(Collection<?> c);

    //移除此 collection 中的所有元素（可选操作）。
    //void clear();

    //比较此 collection 与指定对象是否相等。通过覆盖，实现list与list相等，set与set相等
    //boolean equals(Object o);

    //返回此 collection 的哈希码值。
    //int hashCode();
}
