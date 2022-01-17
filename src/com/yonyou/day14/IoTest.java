package com.yonyou.day14;

import java.io.File;
import java.io.IOException;

/**
 * @Author 王佳鹏
 * @Date 2022/1/13 10:46
 * @Description
 *
 *
 *  案例需求
 * 在当前模块下的aaa文件夹中创建一个a.txt文件
 * 实现步骤
 * 创建File对象,指向aaa文件夹
 * 判断aaa文件夹是否存在,如果不存在则创建
 * 创建File对象,指向aaa文件夹下的a.txt文件
 * 创建这个文件
 *
 */
public class IoTest {
    public static void main(String[] args) throws IOException {
        File file1 = new File("aaa");
        if (!file1.exists()){
        System.out.println(file1.mkdirs());
        }
        File file2 = new File(file1,"a.txt");
        if (file2.exists()){
            file2.delete();

        }
            System.out.println(file2.createNewFile());
            System.out.println("创建文件"+file2.getName());

        }

    }
