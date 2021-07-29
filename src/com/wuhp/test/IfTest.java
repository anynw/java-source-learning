package com.wuhp.test;

/**
 * @Desc：if后面不加{},就近原则，只控制第一句
 * @author: huaping
 * @Date: 2021/7/29 21:56
 */
public class IfTest {
    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        int a ,b ,c = 0;
        if (1 < 2)
            a = 1 ;
            b =2 ;
            c =3 ;
        System.out.println(String.format("a=%s,b=%s,c=%s",a,b,c));//1,2,3
    }

    public static void test2(){
        int x = 0;
        int y = 0;
        int z = 0;
        if (1 > 2)
            x = 1 ;
            y =2 ;
            z =3 ;
        System.out.println(String.format("x=%s,y=%s,z=%s",x,y,z));//0,2,3
    }




}
