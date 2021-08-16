package com.wuhp.util;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @description:Timer只创建唯一的线程来执行所有Timer任务。如果一个timer任务的执行很耗时，会导致其他TimerTask的时效准确性出问题
 * 1.Timer：可以按计划执行重复的任务或者定时执行指定任务，这是因为 Timer 内部利用了一个后台线程 TimerThread
 * 有计划地执行指定任务,Timer是一个实用工具类，该类用来调度一个线程(schedule a thread)，使它可以在将来某一时刻执行。
 * Java 的 Timer 类可以调度一个任务运行一次或定期循环运行。 Timer tasks should complete quickly. 即定时器中的
 * 操作要尽可能花费短的时间
 * 2.TimerTask：一个抽象类，它实现了 Runnable 接口。我们需要扩展该类以便创建自己的 TimerTask ，这个 TimerTask
 * 可以被 Timer 调度。
 * 3.一个 Timer 对象对应的是单个后台线程，其内部维护了一个 TaskQueue，用于顺序执行计时器任务 TimeTask
 * 4.TaskQueue 队列，内部用一个 TimerTask[] 数组实现优先队列（二叉堆），默认最大任务数是 128 ，当添加定时任务超过当前最大容量时会
 * 这个数组会拓展到原来 2 倍
 * @author:Wuhp
 * @createTime:2021/8/15 19:22
 */
public class TimerTest {

    static Timer timer = new Timer();
    public static void main(String[] args) {
        test2();
    }

    public static void test1(){
        //添加任务1,延迟500ms执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("this is task1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },500);

        //添加任务2,延迟1000ms执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("this is task2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },1000);
    }

    public static void test2(){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Date date = new Date(this.scheduledExecutionTime());
                System.out.println("执行时间："+ date);
            }
        };

        // 从现在开始每间隔1000ms计划执行一次任务
        timer.schedule(timerTask,0,1000);
    }

}
