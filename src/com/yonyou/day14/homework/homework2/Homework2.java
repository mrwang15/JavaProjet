package com.yonyou.day14.homework.homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author ������
 * @Date 2022/1/13 18:49
 * @Description
 *
 */
public class Homework2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\24954\\Desktop\\io\\��ʫ\\�ҵ���ʫ");
        file.mkdir();
        File file1 = new File("C:\\Users\\24954\\Desktop\\io\\��ʫ\\����");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\24954\\Desktop\\io\\��ʫ\\�ҵ���ʫ\\������.txt");
            fileOutputStream.write("      ������".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\24954\\Desktop\\io\\��ʫ\\�ҵ���ʫ\\��ҹ˼.txt");
            fileOutputStream.write("      ��ҹ˼".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
