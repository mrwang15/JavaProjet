package com.yonyou.day14;

import java.io.File;
import java.io.IOException;

/**
 * @Author ������
 * @Date 2022/1/13 10:46
 * @Description
 *
 *
 *  ��������
 * �ڵ�ǰģ���µ�aaa�ļ����д���һ��a.txt�ļ�
 * ʵ�ֲ���
 * ����File����,ָ��aaa�ļ���
 * �ж�aaa�ļ����Ƿ����,����������򴴽�
 * ����File����,ָ��aaa�ļ����µ�a.txt�ļ�
 * ��������ļ�
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
            System.out.println("�����ļ�"+file2.getName());

        }

    }
