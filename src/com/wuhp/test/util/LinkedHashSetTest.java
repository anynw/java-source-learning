package com.wuhp.util;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.LinkedHashSet;

/**
 * @description:
 * 1.HashSet计算容量方式：HashSet中使用的是 Math.max((int) (c.size()/.75f) + 1, 16)
 * LinkedHashSet计算容量方式：HashSet中使用的是 super(Math.max(2*c.size(), 11), .75f, true);
 * 2.HashSet 无序，实现了set接口，key不能重复
 * 3.LinkedHashSet有序
 * @author:Wuhp
 * @createTime:2021/8/14 13:05
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        System.out.println(.75f);
    }
}
