package com.yonyou.day10.homework.homework6;

/**
 * @Author ������
 * @Date 2022/1/8 20:59
 * @Description
 *  6.	trim����ֻ��ȥ���ַ�����ǰ��ո����ȥ���ַ����������еĿո����ô���ʵ��
 */
public class Homework6 {
    public static void main(String[] args) {
        String string ="faflafldfjfla f afdaslkfa afdalkfjdal  fakslfjdskalfj fafasfla ";
        String s = string.replaceAll(" ", "");
        System.out.println(s);
    }
}
