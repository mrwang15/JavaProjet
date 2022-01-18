package com.yonyou.day16;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author ������
 * @Date 2022/1/17 17:25
 * @Description
 */

public class homework2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> bd = new ArrayBlockingQueue<>(1);

        Foodie f = new Foodie(bd);
        Cooker c = new Cooker(bd);

        f.start();
        c.start();
    }
}



class Cooker extends Thread {

    private ArrayBlockingQueue<String> bd;

    public Cooker(ArrayBlockingQueue<String> bd) {
        this.bd = bd;
    }

    @Override
    public void run() {

        while (true) {
            if (Foodie.count==10){
                break;
            }
            try {
                bd.put("������");
                System.out.println("��ʦ����һ��������");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Foodie extends Thread {
    static int count=0;
    private ArrayBlockingQueue<String> bd;

    public Foodie(ArrayBlockingQueue<String> bd) {
        this.bd = bd;
    }

    @Override
    public void run() {

        while (true) {
            if (count==10){
                break;
            }
            try {
                String take = bd.take();
                System.out.println("�Ի���" + take + "�ó�������");
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}



