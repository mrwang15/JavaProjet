package com.yonyou.day09.homework;

import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/7 16:41
 * @Description
 *      1������Բ��������뾶����Ϊ��͸���������׳��쳣
 */
public class Homework2 {
    public static final double PAI=3.1415926;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������Բ�İ뾶");
        try {
            double r = scanner.nextDouble();
            if (r<=0){
                throw new rException("����İ뾶̫С");
            }
            System.out.println("Բ�������"+(PAI*r*r));
        }catch (rException e){
            e.getMessage();
            e.printStackTrace();
        }
    }
}


class rException extends Exception{
    public rException() {
    }

    public rException(String message) {
        super(message);
    }
}

