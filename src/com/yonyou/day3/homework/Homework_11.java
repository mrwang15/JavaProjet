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
            System.out.println("����ֻ��۸�Ϊ"+min);

            Scanner scanner= new Scanner(System.in);
            System.out.println("�۳����ֻ�Ϊ��");
            int index = scanner.nextInt();
            if(index<0||index>+phone.length){
                System.out.println("û������ֻ���");
            }
            phone[index][1]=1;
            System.out.println("�۳����ֻ�Ϊ:");
            for (int[] ints : phone) {
                if (ints[1]==1){
                    System.out.println(ints[0]+" ");
                }
            }
            System.out.println("δ�۳����ֻ�Ϊ:");
            for (int[] ints : phone) {
                if (ints[1]==0){
                    System.out.println(ints[0]+" ");
                }
            }
    }
}
