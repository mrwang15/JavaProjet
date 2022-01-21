package com.yonyou.day18;

import java.util.concurrent.Semaphore;

/**
 * @Author ������
 * @Date 2022/1/19 16:58
 * @Description
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        ThreadSemaphore threadSemaphore = new ThreadSemaphore();
        Thread thread = new Thread(threadSemaphore);
        Thread thread2 = new Thread(threadSemaphore);
        Thread thread3 = new Thread(threadSemaphore);
        thread.setName("�߳�1");
        thread2.setName("�߳�2");
        thread3.setName("�߳�3");
        thread.start();
        thread2.start();
        thread3.start();
    }

}

class ThreadSemaphore implements Runnable{
    private Semaphore semaphore = new Semaphore(2);

    @Override
    public void run() {
        try {
            semaphore.acquire(2);
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+"ͨ��");
            System.out.println(Thread.currentThread().getName()+"�黹֤��");
            semaphore.release(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
