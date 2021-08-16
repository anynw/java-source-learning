package com.wuhp.util;

import java.util.Random;

/**
 * @description:Java产生随机数两种方式：Math.random();new Random();
 * @author:Wuhp
 * @createTime:2021/8/15 18:41
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        int i = random.nextInt();
        System.out.println("i = " + i);

        double v = random.nextDouble();
        System.out.println("v = " + v);

        boolean b = random.nextBoolean();
        System.out.println("b = " + b);

        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        Random random10 = new Random(10);
        int i1 = random10.nextInt();
        System.out.println("i1 = " + i1);

        double v1 = random10.nextDouble();
        System.out.println("v1 = " + v1);

        long l = random10.nextLong();
        System.out.println("l = " + l);

        geneRandom();
    }

    public static void geneRandom(){
        Random r = new Random();
        System.out.println("不带种子:");
        for(int i = 1; i <= 10; i++){
            System.out.print(r.nextInt(100)+1+" ");
        }
        System.out.println();

        System.out.println("带种子:");
        r = new Random(100);
        for(int i = 1; i <= 10; i++){
            System.out.print(r.nextInt(100)+1+" ");//16 51 75 89 92 67 37 89 24 14
        }
        System.out.println();

        // 生成22-89之间的随机数
        Random random2 = new Random();
        int i = random2.nextInt(77) + 22;
        System.out.println("生成22-89之间的随机数 = " + i);

        // 生成10-20之间的随机数
        int i1 = random2.nextInt(10) + 10;
        System.out.println("生成10-20之间的随机数 = " + i1);
    }


}
