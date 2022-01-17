package com.yonyou.day15;

import java.io.*;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/14 11:05
 * @Description
 */
public class FileReadTest2 {
    public static void main(String[] args) {
        FileReader fileReader =null;
        try {
            fileReader = new FileReader("a.txt");
            int num=0;
            char[] chars = new char[1024];
            while((num=fileReader.read(chars))!=-1){
                System.out.println(new String(chars,0,num));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
