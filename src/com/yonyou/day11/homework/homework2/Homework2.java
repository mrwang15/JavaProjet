package com.yonyou.day11.homework.homework2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ������
 * @Date 2022/1/10 15:59
 * @Description
 *  2��	ʹ��ArrayList����һ�����ݣ���д���뽫ArrayList�����ظ�������ȥ�������������н������ͼ��ʾ��
 */
public class Homework2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("��а");
        list.add("��а");
        list.add("����");
        list.add("�ϵ�");
        list.add("�ϵ�");
        list.remove("��а");
       list = deduplication(list);
       list.forEach(s-> System.out.println(s));

    }

    public static List deduplication(List<String> list){
        List<String> list1 = new ArrayList<>();
        list.forEach(s -> {
            if(!list1.contains(s)){
                list1.add(s);
            }
        });
        return list1;
    }
}
