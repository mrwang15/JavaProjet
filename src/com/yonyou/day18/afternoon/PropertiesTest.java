package com.yonyou.day18.afternoon;

import java.util.ResourceBundle;

/**
 * @Author ������
 * @Date 2022/1/19 19:53
 * @Description
 *      ����Դ�ļ�
 */
public class PropertiesTest {
    public static void main(String[] args) {
        ResourceBundle resourceBundle =  ResourceBundle.getBundle("application");
        String string = resourceBundle.getString("class");
        System.out.println(string);
    }
}
