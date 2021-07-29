package com.wuhp.test.lang;

/**
 * @Desc：
 * Boolean.valueOf(String) 与 Boolean(String)
 * 1.Boolean 类有静态工厂方法 Boolean.valueOf(String) ，可以直接返回布尔类型的值，不需要开辟内存空间；
 * 2.通过构造器 Boolean(String) 获取返回的布尔值时，都会创建一个新的对象，而这正是我们需要避免的；
 * 3.因此，对于同时提供了静态工厂方法和构造器的不可变类，通常可以使用静态工厂方法而不是构造器，以避免创建不必要的对象。
 * (*引自《Effective Java 中文版第2版》p17 第五条)
 * @author: huaping
 * @Date: 2021/7/27 19:10
 */
public class BooleanTest {
    static Boolean flag1;
    static Boolean flag2 = false;
    // 全局true/false，Boolean aTrue = Boolean.TRUE;获取boolean值
    public static final Boolean TRUE = new Boolean(true);
    public static void main(String[] args) {
        // System.out.println(flag1);//null
        // Boolean flag = true;
        // System.out.println(flag1.hashCode());//空指针
        // System.out.println(flag.hashCode());//1231
        // System.out.println(flag2.hashCode());//1237
        // System.out.println(Boolean.valueOf(flag));
        // int hashCode = "00".hashCode();
        // System.out.println(hashCode);//1536
        // System.out.println("0".hashCode());//48
        compareTest();
    }

    public static int hashCode(boolean value) {
        return value ? 1231 : 1237;
    }

    public static void compareTest(){
        Boolean a = true,b = false, c = true;
        System.out.println(a.compareTo(b));//1
        System.out.println(a.compareTo(c));//0
        System.out.println(b.compareTo(a));//-1
    }

    //源码compare方法
    public static int compare(boolean x, boolean y) {
        return (x == y) ? 0 : (x ? 1 : -1);
    }

    // 如果三个布尔值有两个以上的值为true则返回true，否则返回false
    //方法一
    public static boolean atLeastTwo1(boolean a ,boolean b ,boolean c){
        if((a&&b) || (a&&c) || (b&&c)){
            return true;
        }else{
            return  false;
        }
    }

    //方法二
    public static boolean atLeastTwo2(boolean a ,boolean b ,boolean c){
        return (a&&b) || (a&&c) || (b&&c);
    }

    //方法三
    public static boolean atLeastTwo3(boolean a ,boolean b ,boolean c){
        return a ? (b || c) : (b && c);
    }

    //方法四:^ 异或运算符，同为假，异为真。
    public static boolean atLeastTwo4(boolean a ,boolean b ,boolean c){
        return a ^ b ? c : a;
    }

    //方法五：假设true为1，false为0
    //a&b | a&c | b&c 等同于 a+b+c >= 2
    public static boolean atLeastTwo5(boolean a ,boolean b ,boolean c){
        int result = (a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0);
        return result >= 2;
    }

    //方法六：
    public static boolean atLeastTwo6(boolean a ,boolean b ,boolean c){
        return a == b ? a : c;
    }
}
