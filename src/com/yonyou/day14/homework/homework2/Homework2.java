package com.yonyou.day14.homework.homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 王佳鹏
 * @Date 2022/1/13 18:49
 * @Description
 *
 */
public class Homework2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\24954\\Desktop\\io\\唐诗\\我的唐诗");
        file.mkdir();
        File file1 = new File("C:\\Users\\24954\\Desktop\\io\\唐诗\\备份");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\24954\\Desktop\\io\\唐诗\\我的唐诗\\将进酒.txt");
            fileOutputStream.write("      将进酒".getBytes());
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
            fileOutputStream = new FileOutputStream("C:\\Users\\24954\\Desktop\\io\\唐诗\\我的唐诗\\静夜思.txt");
            fileOutputStream.write("      静夜思".getBytes());
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
