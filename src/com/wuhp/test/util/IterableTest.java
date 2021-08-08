package com.wuhp.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

/**
 * @description:
 * APi简介：
 * // since 1.5
 * Iterator<T> iterator();
 * // since 1.8
 * default void forEach(Consumer<? super T> action){}
 * // since 1.8
 * default Spliterator<T> spliterator(){}
 * 通过test1,test2,test3三个方法的反编译可以得出结论：
 * 1、foreach循环底层调用的是iterator这个说法是错的，应该针对性的讲。对于数组，>foreach底层的实现是简单的for循环，而对于集合，
 * 底层的实现则是通过Iterator来实现的
 * 2、只有实现了Itearable接口的类才能使用foreach遍历也是错的。对于数组，foreach的底层实现则是for，它并没有实现iterator接口
 * @author:Wuhp
 * @createTime:2021/8/7 19:44
 */
public class IterableTest {
    public static void main(String[] args) {
        //test3();
        parallelTest();
    }

    // for 循环遍历集合 以及反编译后的代码
    public static void test1(){
        ArrayList<Integer> a1 = new ArrayList<Integer>(16);
        /*0-5*/
        for (int i = 0; i < 6; i++) {
            a1.add(i);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }
        // 反编译后代码
        /**
         *  ArrayList<Integer> a1 = new ArrayList(16);
         *
         *         int i;
         *         for(i = 0; i < 6; ++i) {
         *             a1.add(i);
         *         }
         *
         *         for(i = 0; i < 6; ++i) {
         *             System.out.println(i);
         *         }
         */
    }

    // foreach遍历集合以及反编译后的代码
    public static void test2(){
        ArrayList<Integer> a1 = new ArrayList<Integer>(16);
        /*0-5*/
        for (int i = 0; i < 6; i++) {
            a1.add(i);
        }
        // foreach循环
        for(Integer i : a1){
            System.out.println(i);
        }

        // 反编译后代码
        /**
         * ArrayList<Integer> a1 = new ArrayList(16);
         *
         *         for(int i = 0; i < 6; ++i) {
         *             a1.add(i);
         *         }
         *          // 调用了集合的Iterator的实现
         *         Iterator var3 = a1.iterator();
         *
         *         while(var3.hasNext()) {
         *             Integer i = (Integer)var3.next();
         *             System.out.println(i);
         *         }
         */
    }

    public static void test3(){
        String[] str = {"a", "b", "c", "d"};
        for (String s : str) {
            System.out.println(s);
        }

        // 编译后的代码
        /**
         *    String[] str = new String[]{"a", "b", "c", "d"};
         *         String[] var1 = str;
         *         int var2 = str.length;
         *
         *         for(int var3 = 0; var3 < var2; ++var3) {
         *             String s = var1[var3];
         *             System.out.println(s);
         *         }
         */
    }

    // 并行遍历元素 foreach和Spliterator一个是顺序遍历元素，一个是并行遍历元素
    public static void parallelTest(){
        String[] str = {"a", "b", "c", "d", "e"};
        List<String> list = Arrays.asList(str);
        Spliterator<String> s = list.spliterator();
        Spliterator<String> s1 =  s.trySplit();
        // 返回值是a,b  split 分割成两个集合
        // 一个为 a,b  一个为 c,d,e
        s.forEachRemaining(System.out :: println);
        s1.forEachRemaining(System.out :: println);
    }

}
