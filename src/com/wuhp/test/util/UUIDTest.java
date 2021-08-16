package com.wuhp.util;

import javax.xml.bind.DatatypeConverter;
import java.security.SecureRandom;
import java.util.UUID;

/**
 * @description:
 * 1.UUID 由32个字母数字字符组成，是有一定格式的，满足8-4-4-4-12这种格式(32+4)
 * @author:Wuhp
 * @createTime:2021/8/15 20:54
 */
public class UUIDTest {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println("uuid = " + uuid);

        System.out.println(uuid.toString().length());
    }
}
