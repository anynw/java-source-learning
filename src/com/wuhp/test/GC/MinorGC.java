package com.wuhp.test.GC;

/**
 * @Desc：
 * @author: huaping
 * @Date: 2021/7/24 16:51
 */
public class MinorGC {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[4*_1MB];allocation1 = new byte[2*_1MB];
        // 出现一次Minor GC
        allocation4 = new byte[4*_1MB];
    }
}
