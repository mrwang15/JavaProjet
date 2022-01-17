package com.yonyou.day14.homework.homework3;

import java.io.*;

/**
 * @Author ������
 * @Date 2022/1/13 19:07
 * @Description
 *  ͨ��������������ҵ���ʫĿ¼�µ������ļ������ݸ��Ƶ�����Ŀ¼�¡�
 */
public class Homework3 {
    public static void main(String[] args) {
       File file1= new File("C:\\Users\\24954\\Desktop\\io\\��ʫ\\�ҵ���ʫ");
       File file2 = new File("C:\\Users\\24954\\Desktop\\io\\��ʫ\\����");
       copyDir(file1,file2);
    }

    /**
     * �����ļ�
     * @param file1 Դ�ļ�
     * @param file2 ���ƺ���ļ�
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
     * @param file1 Դ�ļ���
     * @param file2 ����֮����ļ���
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
