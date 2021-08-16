package com.wuhp.util;

import java.util.Base64;

/**
 * @description:
 * @author:Wuhp
 * @createTime:2021/8/15 17:50
 */
public class Base64Test {
    public static void main(String[] args) {
        base64("1234qwer");
    }

    public static void base64(String str){
        byte[] bytes = str.getBytes();

        //Base64 加密
        String encoded = Base64.getEncoder().encodeToString(bytes);
        System.out.println("Base 64 加密后：" + encoded);

        //Base64 解密
        byte[] decoded = Base64.getDecoder().decode(encoded);

        String decodeStr = new String(decoded);
        System.out.println("Base 64 解密后：" + decodeStr);
    }
}
