package com.wuhp.test.lang;

/**
 * @Desc：
 * @author: huaping
 * @Date: 2021/7/28 22:49
 */
public class LongTest {
    public static void main(String[] args) {
        Long aLong = new Long(1);
        System.out.println(aLong);
        System.out.println(stringSize(10));
        System.out.println(stringSize(1));
        System.out.println(stringSize(100));

        long reverse = Long.reverse(10);
        System.out.println(reverse);
    }

    static int stringSize(long x) {
        long p = 10;
        for (int i=1; i<19; i++) {
            if (x < p)
                return i;
            p = 10*p;
        }
        return 19;
    }


}
