package com.yonyou.day16.homework1;

/**
 * @Author 王佳鹏
 * @Date 2022/1/17 16:50
 * @Description
 */
public class ThreadTest7 {
    public static void main(String[] args) {
        Desk desk = new Desk();
        Producer producer =new Producer(desk);
        Customer customer = new Customer(desk);
        Thread thread = new Thread(producer);
        Thread thread2 = new Thread(customer);
        thread.start();
        thread2.start();
    }

}

class Desk{
    public  Integer count =10;
    public  boolean flag=false;

}

/**
 * 生产者
 */
class Producer implements Runnable{
    Desk dask;

    public Producer(Desk dask) {
        this.dask = dask;
    }

    public Producer() {
    }

    @Override
    public void run() {
        while (true){
            synchronized (dask){
                if (dask.count == 0) {
                break;
                }
                if (!dask.flag){
                    System.out.println("厨师正在生产汉堡包");
                    dask.flag=true;
                        dask.notifyAll();

                }else {
                    try {
                        dask.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }



            }
            }
        }

    }


/**
 * 消费者
 */
class Customer implements  Runnable{
    Desk desk;

    public Customer(Desk desk) {
        this.desk = desk;
    }

    public Customer() {
    }

    @Override
    public void run() {
        while (true){
            synchronized (desk){
                if (desk.count==0){
                    break;
                }
                if (desk.flag){
                    System.out.println("吃货正在吃汉堡包");
                    desk.flag=false;
                    desk.count--;
                    desk.notifyAll();
                }else {
                    try {
                        desk.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
