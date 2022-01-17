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
            System.out.println("你特码吃屎了吧，运气这么好");
        }else {
            System.out.println("你啥也不是啊");
        }

       int random1= (int)(Math.random()*6); // 0<=随机数<1.0
        if(i1==random1){
            System.out.println("你特码吃屎了吧，运气这么好");
        }else {
            System.out.println("你啥也不是啊");
        }


    }


}
