package com.yonyou.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author ������
 * @Date 2022/1/18 16:28
 * @Description
 *  �̳߳�-ExecutorsĬ���̳߳�
 *  ExecutorService executorService = Executors.newCachedThreadPool();
 */
public class ThreadPollTest2 {
    public static void main(String[] args) {
        //1,����һ��Ĭ�ϵ��̳߳ض���.������Ĭ���ǿյ�.Ĭ������������int���͵����ֵ
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"��ִ��");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"��ִ��");
        });
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"��ִ��");
        });

        executorService.shutdown();

    }
}
