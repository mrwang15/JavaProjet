package com.yonyou.day11.homework.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author ������
 * @Date 2022/1/10 16:26
 * @Description
 *  5��	��дһ������ʹ��forѭ������100��1��100֮���������������ظ������ݴ���List1�У���ʣ������ݴ���List2�С�
 */
public class Homework5 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        Random random = new Random();
        for (int i = 0; i <100 ; i++) {
            int ran = random.nextInt(100)+1;
            if (!list1.contains(ran)){
                list1.add(ran);
            }else {
                list2.add(ran);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
    }

}
