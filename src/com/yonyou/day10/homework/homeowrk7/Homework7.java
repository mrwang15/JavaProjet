package com.yonyou.day10.homework.homeowrk7;

/**
 * @Author ������
 * @Date 2022/1/8 20:55
 * @Description
 *  7.	��д������ҡ��Ұ����й����Ұ�����硱�����м����������֡�
 */
public class Homework7 {
    public static void main(String[] args) {
        int count=0;
        String sdaf="�Ұ����й����Ұ������";
        char[] chars = sdaf.toCharArray();
        for (char aChar : chars) {
            if (aChar=='��'){
                count++;
            }
        }
        System.out.println("\"��\"������Ϊ"+count);
    }

}
