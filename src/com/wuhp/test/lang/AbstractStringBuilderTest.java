package com.anynw.lang;

import java.io.IOException;

/**
 * @description:
 * 1.类声明：abstract class AbstractStringBuilder implements Appendable, CharSequence
 * @author:Wuhp
 * @createTime:2021/7/27 13:33
 */
public class AbstractStringBuilderTest {
    public static void main(String[] args) {
        /**
         *  CharSequence:
         *  1.该接口规定了需要实现该字符序列的长度:length()；
         *  2.可以取得下标为index的的字符：charAt(int index)；
         *  3.可以得到该字符序列的一个子字符序列： subSequence(int start, int end)；
         *  4.规定了该字符序列的String版本（重写了父类Object的toString()）：toString();
         *  Appendable:
         *  1.append(CharSequence csq) throws IOException:如何添加一个字符序列
         *  2.append(CharSequence csq, int start, int end) throws IOException：如何添加一个字符序列的一部分
         *  3.append(char c) throws IOException:如何添加一个字符
         *
         */
        abstract class AbstractStringBuilder implements Appendable, CharSequence{
        }

        char[] value;

        int count;

        new AbstractStringBuilder(){
            @Override
            public int length() {
                return 0;
            }

            @Override
            public char charAt(int index) {
                return 0;
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                return null;
            }

            @Override
            public Appendable append(CharSequence csq) throws IOException {

                return null;
            }

            @Override
            public Appendable append(CharSequence csq, int start, int end) throws IOException {
                return null;
            }

            @Override
            public Appendable append(char c) throws IOException {
                return null;
            }
        };
        // 扩容机制,AbstractStringBuilder中方法append(),扩容方法就是扩容为原来的 2 倍再加 2 ，然后判断新长度的合法性，
        // 不合法会抛出 OOM ，合法会复制一个新长度的数组覆盖原来的数组。
        System.out.println();
    }
}
