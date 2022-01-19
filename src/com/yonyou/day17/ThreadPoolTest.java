package com.yonyou.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author 王佳鹏
 * @Date 2022/1/18 15:52
 * @Description
 *      线程池-Executors创建指定上限的线程池
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //1、创建一个默认的线程池对象，默认这个线程池是空的
        ExecutorService executorService = Executors.newFixedThreadPool(10);//参数的最大值 返回值是ExecutorService 这是一个接口
        //Executors用来创建线程池对象
        //ExecutorService用来控制线程池对象
        //Future<?> submit(Runnable task)
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });

        //这里主线程进行睡眠，
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //执行到这里的时候，线程池中已经有了空闲线程了
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        //void execute(Runnable command)
       /* 无返回值的任务使用public void execute(Runnable command) 方法提交；
        有返回值的任务使用public <T> Future<T> submit(Callable) 方法提交。*/
        executorService.execute(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        //用于关闭线程池
        executorService.shutdown();


    }
}
