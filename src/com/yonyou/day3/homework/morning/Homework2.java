package com.yonyou.day3.homework.morning;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("输入打印的行数：");
        int len=scanner.nextInt();
        int a= len/2+1;
        for(int i = 1;i<=a;i++){
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =len-a;i >0;i--){
            for(int j = 0;j <a-i;j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
