package com.wuhp.test.lang;

import java.lang.reflect.Field;

/**
 * @Desc：
 * intern()方法的作用：将new的字符串放入字符串常量池或从字符串常量池中查找具有相同的值字符串对象并返回其引用
 * @author: huaping
 * @Date: 2021/7/26 20:35
 */
public class StringTest {
    public static void main(String[] args) {
        // intern();
        equalsTest();
        // stringIntern();
    }

    /**
     * 1、代码片段1：常量池拼接会调用StringBuffer.append()的方法，在堆上创建新的对象。intern()方法执行的时候，常量池中没有str000的字符串，所以它在
     * 常量池中创建一个对堆中字符串str000的引用。String str1 = "str000";赋值的时候，因为常量池中已经存在了一个引用，所以直接返回了这个
     * 引用，所以str1，str2执行同一个堆中的字符串对象，返回true。
     * 2、代码片段2：返回false。new的对象在堆中，String str1 = "str000";字符串常量赋值，先在常量池中寻找是否存在引用，若存在，则将栈中的引用直接
     * 指向该字符串，若不存在，则在常量池中生成一个字符串，再将栈中的引用指向该字符串。
     */
    public static void intern() {
        // 代码片段1：返回值为true
        // String str2 = new String("str") + new String("000");
        // str2.intern();
        // String str1 = "str000";
        // 代码片段2：返回值为false
        String str2 = new String("str") + new String("000");
        String str1 = "str000";
        str2.intern();
        System.out.println(str1 == str2);
    }

    public static void stringIntern(){
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);

        // StringBuilder.toString()方法执行之前，java字符串在常量池中已经有了它的引用，不符合“首次出现”的原则《
        // 深入理解JAVA虚拟机》57P
        // 为什么已经出现？什么时候加进去的？
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern()==str2);

    }

    public static void equalsTest() {
        // Q：下列程序的输出结果：
        // String s1 = "abc";
        // String s2 = "abc";
        // System.out.println(s1 == s2);
        // A：true，均指向常量池中对象。

        // Q：下列程序的输出结果：
        // String s11 = new String("abc");
        // String s22 = new String("abc");
        // System.out.println(s11 == s22);
        // A：false，两个引用指向堆中的不同对象。

        // Q：下列程序的输出结果：
        // String s1 = "abc";
        // String s2 = "a";
        // String s3 = "bc";
        // String s4 = s2 + s3;
        // System.out.println(s1 == s4);
        // A：false，因为s2 + s3实际上是使用StringBuilder.append来完成，会生成不同的对象。

        // Q：下列程序的输出结果：
        // String s1 ="abc";
        // final String s2 = "a";
        // final String s3 = "bc";
        // String s4 = s2 + s3;
        // System.out.println(s1 == s4);
        // A：true，因为final变量在编译后会直接替换成对应的值，所以实际上等于s4=”a”+”bc”，而这种情况下，编译器会直接合并为s4=”abc”，
        // 所以最终s1==s4。

        // Q：下列程序的输出结果：
        // String s = new String("abc");
        // String s1 = "abc";
        // String s2 = new String("abc");
        // System.out.println(s == s1.intern());
        // System.out.println(s == s2.intern());
        // System.out.println(s1 == s2.intern());
        // A：false，false，true。


        // String str1 = new String("A") + new String("B");
        // System.out.println(str1.intern() == str1);//intern()在常量池中未找到对象，便指向堆中的对象str1。
        // System.out.println(str1 == "AB");//AB赋值在常量池中，直接指向了str1。


        String str1 = "abc";
        String str2 = new String("def");
        String str3 = "abc";
        String str4 = str2.intern();
        String str5 = "def";
        System.out.println(str1 == str3);//true
        System.out.println(str2 == str4);//false
        System.out.println(str4 == str5);//true


        // 通过反射验证是否为同一个对象
        // 第一种情况：c1 c2 无关
        // String a1 = "abc";
        // String b1 = "123";
        // String c1 = "abc123";
        // String c2 = a1 + b1;
        // 第二种情况：c1 c2 同步
        final String a1 = "abc";
        final String b1 = "123";
        String c1 = "abc123";
        String c2 = a1 + b1;

        System.out.println("修改之前:");
        System.out.println(c1);
        System.out.println(c2);
        try {
            Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);
            char[] charValue = (char[])field.get(c1);
            charValue[5] = '9';
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("修改之后:");
        System.out.println(c1);
        System.out.println(c2);

        //--- 内存地址已经发生变化
        String s ="hello";
        s ="world";
    }

    // 判断两个String对象是否相等,重写equals？参考源码，对比char[]中每个元素时，可改为对象的属性
}
