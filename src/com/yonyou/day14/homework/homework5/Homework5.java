package com.yonyou.day14.homework.homework5;

import java.io.*;

import static com.yonyou.day14.homework.homework3.Homework3.copy;

/**
 * @Author ������
 * @Date 2022/1/13 20:09
 * @Description
 *  4��	��d�̵ĸ�Ŀ¼�±�������ͼƬ�ļ���һ��Ϊ.jpg��ʽ���ļ���
 *  ��һ����.png��ʽ���ļ���
 *  ʹ��File�ഴ������Ŀ¼��
 *  Ŀ¼���ֱ�Ϊ��jpgͼƬ���͡�pngͼƬ����
 *  Ȼ����չ��Ϊ.png��ͼƬ�ƶ���pngͼƬĿ¼�£�
 *  ��jpg��ʽ��ͼƬ�ƶ���jpgͼƬ��Ŀ¼�¡�
 */
public class Homework5 {
    public static void main(String[] args) {
        File file1 = new File("jpg�ļ�");
        File file2 = new File("png�ļ�");
        File file3 = new File("C:\\Users\\24954\\Desktop\\io");
        file1.mkdir();
        file2.mkdir();
        File file4 = new File(file1, "jpg�ļ�");
        File file5 = new File(file1, "png�ļ�");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream=null;
        File[] files = file3.listFiles();
        for (File file : files) {


            if(file.getName().endsWith(".jpg")) {
               copy(file,file4);
                }
            else {
                copy(file,file5);

            }
            }
        }
    }

