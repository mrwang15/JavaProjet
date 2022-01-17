package com.yonyou.day15;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 王佳鹏
 * @Date 2022/1/14 10:51
 * @Description
 */
public class FileWriteTest {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("a.txt");
            fileWriter.write("我是中国人");
            fileWriter.write("我是个java工程师",2,4);
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
