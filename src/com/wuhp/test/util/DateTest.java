package com.wuhp.util;

import java.time.Instant;
import java.util.Date;

/**
 * @description:
 * @author:Wuhp
 * @createTime:2021/8/15 18:21
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long time = date.getTime();
        System.out.println("time = " + time);

        String s = date.toString();
        System.out.println("s = " + s);

        Instant instant = date.toInstant();
        System.out.println("instant = " + instant);

        // long ht = this.getTime();
        // return (int) ht ^ (int) (ht >> 32);
        int i = date.hashCode();
        System.out.println("i = " + i);

        Object clone = date.clone();
        System.out.println("clone = " + clone);

    }

}
