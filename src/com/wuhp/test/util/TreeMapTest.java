package com.wuhp.util;

import java.util.*;

/**
 * @description:平衡二叉树
 *
 * @author:Wuhp
 * @createTime:2021/8/14 17:13
 */
public class TreeMapTest {
    public static void main(String[] args) {
        new TreeMap<String,Object>();
        for (int i = 0;i < 10 ;i++){
            System.out.println(getFib(i));
        }
        test1();
    }


    public static void test1(){
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i=0;i<10;i++){
            Double random = Math.random()*1000;
            integers.add(random.intValue());
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (Integer j : integers){
            treeMap.put(j,j);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = treeMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            System.out.println("key="+next.getKey()+";value="+next.getValue());
        }
    }

    public static int getFib(int n){
        if(n == 0 || n ==1){
            return n;
        }
        return getFib(n-1) + getFib( n-2) ;
    }

}
