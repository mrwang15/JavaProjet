package com.yonyou.day11.homework.homework1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author ������
 * @Date 2022/1/10 15:36
 * @Description
 *  ����
 */
public class Queue {
    public void  queue(){
            LinkedList<String> list = new LinkedList<>();
            list.addFirst("������ȸ");
            list.addFirst("��������");
            list.addFirst("��������");
            list.addFirst("���а׻�");
        Iterator<String> iterator = list.iterator();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String string = list.removeFirst();
            System.out.println(string);
        }

    }
}


class Stack{
    public void stack(){
        List<String> list = new ArrayList<>();
        list.add("ѹջ��а");
        list.add("ѹջ����");
        list.add("ѹջ�ϵ�");
        list.add("ѹջ��ؤ");
        list.forEach(string -> System.out.println(string));
    }
}