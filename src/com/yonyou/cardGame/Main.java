package com.yonyou.cardGame;

import org.omg.PortableServer.POA;

import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/6 13:36
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("��ӭ����");
        Poker poker = new Poker();
        Person person= new Person();
        Person computer= new Person();
        Dealer dealer = new Dealer(person,computer,poker);

        dealer.play();
    }
}
