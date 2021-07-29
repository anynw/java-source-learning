package com.wuhp.test.GC;

/**
 * @Desc：
 * @author: huaping
 * @Date: 2021/7/24 17:20
 */
public class MaxTenuringThresholdTest {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[_1MB/4];
        // 什么时候进入老年代取决于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4*_1MB];
        allocation3 = new byte[4*_1MB];
        allocation3 = null;
        // 出现一次Minor GC
        allocation3 = new byte[4*_1MB];
    }
}
