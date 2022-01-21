package com.yonyou.day18.afternoon;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author 王佳鹏
 * @Date 2022/1/19 18:36
 * @Description
 *      ClassLoader 中的两个方法【应用】
 */
public class ClassLoaderDemo2 {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader system = ClassLoader.getSystemClassLoader();
        InputStream stream = system.getResourceAsStream("application.properties");
        Properties properties = new Properties();
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(properties.get("name"));

        System.out.println(properties);
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
