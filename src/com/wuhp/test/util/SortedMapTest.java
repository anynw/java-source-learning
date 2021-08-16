package com.wuhp.util;

import java.util.*;

/**
 * @description:
 * @author:Wuhp
 * @createTime:2021/8/15 10:46
 */
public class SortedMapTest {
    public static void main(String[] args) {
        new SortedMap() {
            // 返回用于对此映射中的键进行排序的比较器;如果此映射使用其键的自然顺序，则返回null
            @Override
            public Comparator comparator() {
                return null;
            }

            // 返回此映射部分的视图，其键的范围从fromKey（包括）到 toKey（不包括）。
            // （如果fromKey和 toKey 相等，则返回的视图为空。
            @Override
            public SortedMap subMap(Object fromKey, Object toKey) {
                return null;
            }

            // 返回此映射的部分视图，其键的范围小于 toKey
            @Override
            public SortedMap headMap(Object toKey) {
                return null;
            }

            // 返回此映射的部分视图，其键的范围大于等于fromKey
            @Override
            public SortedMap tailMap(Object fromKey) {
                return null;
            }

            // 返回此映射中当前的第一个键
            @Override
            public Object firstKey() {
                return null;
            }

            // 返回此映射中当前的最后一个键
            @Override
            public Object lastKey() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set keySet() {
                return null;
            }

            @Override
            public Collection values() {
                return null;
            }

            @Override
            public Set<Entry> entrySet() {
                return null;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };
    }
}
