package com.yonyou.day2.homework;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(6);
        Scanner scanner= new Scanner(System.in);
        int i1 = scanner.nextInt();
        if(i1==i){
            System.out.println("�������ʺ�˰ɣ�������ô��");
        }else {
            System.out.println("��ɶҲ���ǰ�");
        }

       int random1= (int)(Math.random()*6); // 0<=�����<1.0
        if(i1==random1){
            System.out.println("�������ʺ�˰ɣ�������ô��");
        }else {
            System.out.println("��ɶҲ���ǰ�");
        }


    }


}
