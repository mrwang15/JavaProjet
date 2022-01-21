package com.yonyou.day18.afternoon;

import java.util.ResourceBundle;

/**
 * @Author 王佳鹏
 * @Date 2022/1/19 19:53
 * @Description
 *      绑定资源文件
 */
public class PropertiesTest {
    public static void main(String[] args) {
        ResourceBundle resourceBundle =  ResourceBundle.getBundle("application");
        String string = resourceBundle.getString("class");
        System.out.println(string);
    }
}
