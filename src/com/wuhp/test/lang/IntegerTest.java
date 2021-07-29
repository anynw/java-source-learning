package com.wuhp.test.lang;

/**
 * @Desc：
 * 1.当数值范围为-128~127时：如果两个new出来Integer对象，即使值相同，通过“==”比较结果为false，但两个对象直接赋值，则通过“==”比较结果为
 * “true，这一点与String非常相似。
 * 2.当数值不在-128~127时，无论通过哪种方式，即使两个对象的值相等，通过“==”比较，其结果为false；
 * 3.当一个Integer对象直接与一个int基本数据类型通过“==”比较，其结果与第一点相同；
 * 4.Integer对象的hash值为数值本身；
 * 5.JVM维护着8种基本数据类型，在虚拟机栈局部变量表中，boolean,byte,short,char,int,float,double,long,其中double,long占用两个局部
 * 变量空间（slot），其余数据类型占用一个，局部变量表所需的内存空间在编译期间完成分配，在方法运行期间不会改变局部变量表的大小。
 * -128～127之间的值在常量池中之中直接返回，而不在这个区间的数通过new Integer()方法返回。
 * @author: huaping
 * @Date: 2021/7/26 18:58
 */
public class IntegerTest {
    public static void main(String[] args) {

        Integer x = 128;
        Integer y = 128;

        Integer a = 1;
        Integer b = 1;

        System.out.println(a==b);//true
        int c = 2;
        int d = 2;
        System.out.println(c==d);//true

        a = 127;
        b = 127;

        System.out.println(a==b);//true

        a = 128;
        b = 128;

        System.out.println(a==b);//false

        System.out.println(x.hashCode());

    }
}
