package com.yonyou.day10.homework.homework1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.awt.windows.WPrinterJob;

/**
 * @Author ������
 * @Date 2022/1/8 19:54
 * @Description
 *      1.	����weekö�٣�����MONDAY��TUESDAY��WEDNESDAY��THURSDAY��FRIDAY��SATURDAY��SUNDAYÿ��ö�������һ�����ĵ����ơ�
 *      ���������࣬�ڲ����൱�д���ö����Ķ���ͨ��switch�ж�ö�����ֵ������Ӧ�������
 *      ��������һ�����������԰ײˡ������ڶ������������Բ��ˡ���
 *      ��������������ܲ����������ġ�����Զ�������
 *      �����塰�������������
 *      ���������������һ�³����㡱
 *      �����ա������¹��ӡ���
 */
public class Homework1 {
    public static void main(String[] args) {
        Week week=Week.MONDAY;
        System.out.println(week);
        switch ( week){
            case MONDAY:
                System.out.println();
                break;
        }

    }

}

enum Week{
    MONDAY("����԰ײ�"),TUESDAY("����Բ���"),WEDNESDAY("������ܲ�") ,
    THURSDAY("����Զ���"),FRIDAY("���������"),
    SATURDAY("�������һ�³�����"),SUNDAY("�����¹���");

    private String name;

    Week(String name) {
        this.name = name;
    }


}