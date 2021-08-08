package com.wuhp.lang;

import org.junit.Test;

/**
 * @description:线程不安全
 * @author:Wuhp
 * @createTime:2021/7/27 15:41
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        System.out.println(stringBuilder.toString());
    }

    @Test
    public void index(){
        System.out.println("test");
    }
}
