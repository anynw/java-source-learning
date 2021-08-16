package com.wuhp.util;

import java.util.Stack;

/**
 * @description:栈是一种先进后出的数据结构
 * 栈继承Vector类
 * @author:Wuhp
 * @createTime:2021/8/15 10:26
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        int search = stack.search(2);
        System.out.println(search);
        Object peek = stack.peek();
        stack.pop();
        boolean add = stack.add(3);
        Object clone = stack.clone();
        stack.clear();
        System.out.println(stack.toString());
    }
}
