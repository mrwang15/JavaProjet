package com.yonyou.day09.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/7 16:31
 * @Description
 *  ���տ���̨��ʾ����1��3֮����һ�����֣����������Ӧ�Ŀγ�����
 *  ���ݼ�����������жϡ����������ȷ�������Ӧ�γ����ơ����������󣬸���������ʾ
 *  ���������Ƿ���ȷ�����������ӭ������飡�����
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("������ѡ��Ŀγ̣�1.����   2.��ѧ    3.Ӣ��");
        try {
            int i = scanner.nextInt();
            if (i==1){
                System.out.println("����");
            }else if(i==2){
                System.out.println("��ѧ");
            }else if (i==3){
                System.out.println("Ӣ��");
            }else {
                System.out.println("������Ŀγ̲�����");
            }
        }catch (InputMismatchException e){
            System.out.println("������Ĳ�������");
        }finally {
            System.out.println("��ӭ������飡��");
        }
    }
}
