package com.wuhp.test.lang;

/**
 * @Desc：
 * @author: huaping
 * @Date: 2021/7/27 22:57
 */
public class FloatTest {
    public static void main(String[] args) {
        Float aFloat = new Float("123");
        System.out.println(aFloat);

        //对于不能用二进制表示的 十进制小数，二进制小数位会进行循环，所以会损失精度
        System.out.println(2.2f == 2.20000001f);//true
    }
}
