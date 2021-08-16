package com.wuhp.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @description:集合工具类，提供了很多静态方法
 * @author:Wuhp
 * @createTime:2021/8/15 11:16
 */
public class CollectionsTest {
    public static void main(String[] args) {
        rotateTest();
    }

    public static void rotateTest(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        System.out.println("原来的integers = " + integers);
        //Collections.rotate(integers,3);
        //System.out.println("右移3位后的integers = " + integers);
        //Collections.rotate1(integers,-3);
        //System.out.println("左移3位后的integers = " + integers);

        rotate2(integers,3);
        System.out.println("右移3位后的integers = " + integers);
    }

    /**
     * list = [1, 2, 3, 1, 5, 6, 7, 8, 9]
     * list = [1, 2, 3, 1, 5, 6, 4, 8, 9]
     * list = [7, 2, 3, 1, 5, 6, 4, 8, 9]
     *
     * list = [7, 2, 3, 1, 2, 6, 4, 8, 9]
     * list = [7, 2, 3, 1, 2, 6, 4, 5, 9]
     * list = [7, 8, 3, 1, 2, 6, 4, 5, 9]
     *
     * list = [7, 8, 3, 1, 2, 3, 4, 5, 9]
     * list = [7, 8, 3, 1, 2, 3, 4, 5, 6]
     * list = [7, 8, 9, 1, 2, 3, 4, 5, 6]
     * @param list
     * @param distance
     */
    public static void rotate1(List<Integer> list, int distance){
        int size = list.size();
        if(size == 0)
            return;
        distance = distance % size;
        if(distance == 0)
            return;
        if(distance < 0)
            distance = distance + size;

        for(int cycleStart= 0,nMoved = 0;nMoved != size; cycleStart++){
            Integer displaced = list.get(cycleStart);
            int i = cycleStart;
            do{
                i = i + distance;
                if(i >= size)
                    i = i-size;
                System.out.println("list = " + list);
                displaced = list.set(i,displaced);
                nMoved++;
                System.out.println("list = " + list);
            }while(i != cycleStart);
        }

    }

    /**
     * 第一次反转后的list = [6, 5, 4, 3, 2, 1, 7, 8, 9]
     * 第二次反转后的list = [6, 5, 4, 3, 2, 1, 9, 8, 7]
     * 第三次反转后的list = [7, 8, 9, 1, 2, 3, 4, 5, 6]
     * @param list
     * @param distance
     */
    public static void rotate2(List<Integer> list, int distance){
        int size = list.size();
        if(size == 0)
            return;
        int mid = - distance % size;
        if(mid < 0)
            mid = mid + size;
        if(mid == 0)
            return;
        Collections.reverse(list.subList(0,mid));
        System.out.println("第一次反转后的list = " + list);
        Collections.reverse(list.subList(mid,size));
        System.out.println("第二次反转后的list = " + list);
        Collections.reverse(list);
        System.out.println("第三次反转后的list = " + list);
    }

    public static void testMethods(){
        System.out.println(4>>>2);
        System.out.println(4>>>1);
        System.out.println(4>>2);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        System.out.println("旧strings = " + strings);
        // 反转
        Collections.reverse(strings);
        System.out.println("反转过后的strings = " + strings);

        // 二分查找的前提条件是集合首先是有序的，集合中的元素都可以进行比较，类型相同。
        Collections.sort(strings);
        System.out.println("默认排序后的strings = " + strings);

        int a = Collections.binarySearch(strings, "a");
        System.out.println("a = " + a);

        Collections.shuffle(strings);
        System.out.println("重新打乱元素顺序后的strings = " + strings);

        // 第一种方式：初始化dest的容量
        ArrayList<String> destStrings = new ArrayList<>(Arrays.asList(new String[strings.size()]));
        // 第二种方式：声明一个空集合，添加string类型的集合添加到集合中
        //ArrayList<String> destStrings = new ArrayList<>(4);
        //Collections.addAll(destStrings,new String[strings.size()]);
        System.out.println("String类型的空值，destStrings = " + destStrings);
        Collections.copy(destStrings,strings);
        System.out.println("拷贝过的destStrings = " + destStrings);

        String min = Collections.min(strings);
        System.out.println("min = " + min);

        String max = Collections.max(strings);
        System.out.println("max = " + max);
    }


}
