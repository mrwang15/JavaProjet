package com.yonyou.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/14 10:54
 * @Description
 */
public class FileReadTest {
    public static void main(String[] args) {
        FileReader fileReader =null;
        try {
            fileReader = new FileReader("a.txt");
            int ch=0;
            while ((ch=fileReader.read())!=-1){
                System.out.println((char)ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
