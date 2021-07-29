package com.wuhp.test.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc：
 * @author: huaping
 * @Date: 2021/7/24 14:30
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("k1",1);
        map.put("k2",2);
        map.put("k3",3);
        map.put("k4",4);
        System.out.println(map.toString());
    }
}
