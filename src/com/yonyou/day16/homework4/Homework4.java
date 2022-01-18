package com.yonyou.day16.homework4;

import com.yonyou.cardGame.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author ������
 * @Date 2022/1/17 18:11
 * @Description
 *  ������������
 */
public class Homework4 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        Producer producer = new Producer(lists);
        Consumer consumer = new Consumer(lists);
        Thread thread = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread.start();
        thread2.start();
    }
}

class Producer implements Runnable{
    private List<String> lists;

    public Producer(List<String> lists) {
        this.lists = lists;
    }

    public Producer() {
    }

    @Override
    public void run() {
        while(true) {
            synchronized (lists) {
                if (lists.size() > 10) {
                    try {
                        lists.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lists.add("����һ�������Ž�ȥ");
                System.out.println(Thread.currentThread().getName()+"����һ�������Ž�ȥ");
                lists.notify();

            }
        }

    }


}


class Consumer implements Runnable{
    List<String> lists;

    public Consumer(List<String> lists) {
        this.lists = lists;
    }

    public Consumer() {
    }

    @Override
    public void run() {
        while (true){
            synchronized (lists) {
                if (lists.size() == 0) {
                    try {
                        lists.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                String remove = lists.remove(0);
                System.out.println(Thread.currentThread().getName()+"������"+remove);
                lists.notify();

            }
        }
    }
}
