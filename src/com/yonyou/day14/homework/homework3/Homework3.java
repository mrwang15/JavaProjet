package com.yonyou.day14.homework.homework3;

import java.io.*;

/**
 * @Author 王佳鹏
 * @Date 2022/1/13 19:07
 * @Description
 *  通过输入输出流将我的唐诗目录下的所有文件及内容复制到备份目录下。
 */
public class Homework3 {
    public static void main(String[] args) {
       File file1= new File("C:\\Users\\24954\\Desktop\\io\\唐诗\\我的唐诗");
       File file2 = new File("C:\\Users\\24954\\Desktop\\io\\唐诗\\备份");
       copyDir(file1,file2);
    }

    /**
     * 复制文件
     * @param file1 源文件
     * @param file2 复制后的文件
     */
    public static void copy(File file1, File file2){
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream= new FileInputStream(file1);
            fileOutputStream=new FileOutputStream(file2);
            byte[] bytes = new byte[1024];
            int leng=0;
            while ((leng=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,leng);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     *
     * @param file1 源文件夹
     * @param file2 复制之后的文件夹
     */
    public static void copyDir(File file1,File file2){
        File[] files = file1.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                String name = file.getName();
                File file3 = new File(file2, name);
                file3.mkdir();
                copyDir(file,file3);
            }else {
                String name = file.getName();
                File file3 = new File(file2, name);
                copy(file,file3);
            }
        }
    }
}
