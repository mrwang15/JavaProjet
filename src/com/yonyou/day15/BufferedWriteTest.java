package com.yonyou.day15;



import java.io.*;
import java.util.TreeMap;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/14 11:51
 * @Description
 */
public class BufferedWriteTest {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter =null;
        FileWriter fileWriter= null;
        try {
            fileWriter =new FileWriter("a.txt");
            bufferedWriter = new BufferedWriter(fileWriter,8);
            bufferedWriter.write("111ajfl;kdskksksksksksksksksks1111");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
