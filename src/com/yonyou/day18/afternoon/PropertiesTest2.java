package com.yonyou.day18.afternoon;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/19 20:06
 * @Description
 */
public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        Object aClass = properties.get("class");
        System.out.println(aClass);
    }
}
