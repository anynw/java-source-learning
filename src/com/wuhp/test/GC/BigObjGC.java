package com.wuhp.test.GC;

/**
 * @Desc：
 * @author: huaping
 * @Date: 2021/7/24 17:08
 */
public class BigObjGC {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        test();
    }
    public  static void test(){
        byte[] allocation;
        // 直接分配到老年代中
        allocation = new byte[4*_1MB];
    }
}
