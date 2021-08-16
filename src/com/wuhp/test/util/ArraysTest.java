package com.wuhp.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @description:
 * @author:Wuhp
 * @createTime:2021/8/15 15:51
 */
public class ArraysTest {
    public static void main(String[] args) {
        intHashCode();
        longHashCode();
        booleanHashCode();
        int a[] = {2,4,5,1,7,9,0};
        int i = binarySearch(a, 0, 4, 2);
        System.out.println("i = " + i);

        // 创建一个Stream
        IntStream intStream = Arrays.stream(a);
        Stream<String> stringStream = Arrays.stream(new String[]{"a", "b", "c"});
    }

    public static void intHashCode(){
        int a[] = {1,2,3,};
        int i = Arrays.hashCode(a);
        // result = 31 * result + element;
        System.out.println("i = " + i);
    }

    public static void longHashCode(){
        long a[] = {1L,2L,3L};
        int i = Arrays.hashCode(a);
        //  int elementHash = (int)(element ^ (element >>> 32));
        //  result = 31 * result + elementHash;
        System.out.println("i = " + i);
    }

    public static void booleanHashCode(){
        boolean a[] = {true,false};
        int i = Arrays.hashCode(a);
        // result = 31 * result + (element ? 1231 : 1237);
        System.out.println("i = " + i);
    }
    // 二分查找
    public static int binarySearch(int[] a, int fromIndex,int toIndex,int key){
        int low = fromIndex;
        int high = toIndex -1;
        while (low <= high){
            int mid = (low + high) >> 1;
            int midVal = a[mid];
            if(midVal < key){
                mid = low + 1;
            }else if(midVal < key){
                high = mid - 1;
            }else
                return mid;
        }
        return -(low + 1);
    }
}
