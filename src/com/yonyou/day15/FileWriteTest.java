package com.yonyou.day15;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author ������
 * @Date 2022/1/14 10:51
 * @Description
 */
public class FileWriteTest {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("a.txt");
            fileWriter.write("�����й���");
            fileWriter.write("���Ǹ�java����ʦ",2,4);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
