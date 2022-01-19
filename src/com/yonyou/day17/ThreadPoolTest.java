package com.yonyou.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author ������
 * @Date 2022/1/18 15:52
 * @Description
 *      �̳߳�-Executors����ָ�����޵��̳߳�
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //1������һ��Ĭ�ϵ��̳߳ض���Ĭ������̳߳��ǿյ�
        ExecutorService executorService = Executors.newFixedThreadPool(10);//���������ֵ ����ֵ��ExecutorService ����һ���ӿ�
        //Executors���������̳߳ض���
        //ExecutorService���������̳߳ض���
        //Future<?> submit(Runnable task)
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"��ִ��");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"��ִ��");
        });

        //�������߳̽���˯�ߣ�
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //ִ�е������ʱ���̳߳����Ѿ����˿����߳���
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"��ִ��");
        });
        //void execute(Runnable command)
       /* �޷���ֵ������ʹ��public void execute(Runnable command) �����ύ��
        �з���ֵ������ʹ��public <T> Future<T> submit(Callable) �����ύ��*/
        executorService.execute(()->{
            System.out.println(Thread.currentThread().getName()+"��ִ��");
        });
        //���ڹر��̳߳�
        executorService.shutdown();


    }
}
