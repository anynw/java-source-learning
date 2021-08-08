package com.anynw.lang;

/**
 *
 * @description:线程安全
 * @author:Wuhp
 * @createTime:2021/7/27 15:26
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("1");
        sb.append("2");
        sb.append("3");
        StringBuffer delete = sb.delete(0, 1);
        System.out.println(delete);
        String s = sb.toString();
        System.out.println(s);
    }

}
