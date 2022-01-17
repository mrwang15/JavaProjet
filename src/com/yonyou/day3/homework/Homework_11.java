package com.yonyou.day3.homework;

import java.util.Scanner;

public class Homework_11 {
    public static void main(String[] args) {
        int[][] phone = {{5699,0},{3699,0},{8959,0},{2121,0}};
        int min= phone[0][0];
        for(int i=1;i<phone.length;i++) {
            if (min > phone[i][0]) {
                min = phone[i][0];
            }
        }
            System.out.println("最低手机价格为"+min);

            Scanner scanner= new Scanner(System.in);
            System.out.println("售出的手机为：");
            int index = scanner.nextInt();
            if(index<0||index>+phone.length){
                System.out.println("没有这个手机啊");
            }
            phone[index][1]=1;
            System.out.println("售出的手机为:");
            for (int[] ints : phone) {
                if (ints[1]==1){
                    System.out.println(ints[0]+" ");
                }
            }
            System.out.println("未售出的手机为:");
            for (int[] ints : phone) {
                if (ints[1]==0){
                    System.out.println(ints[0]+" ");
                }
            }
    }
}
