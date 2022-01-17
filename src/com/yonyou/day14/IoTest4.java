package com.yonyou.day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/13 14:26
 * @Description
 */
public class IoTest4 {
    public static void main(String[] args) {
        FileInputStream  fileInputStream;
        try {
            byte[] bytes = new byte[3];
            fileInputStream = new FileInputStream("a.txt");
            int lenth=-0;
            while ((lenth=fileInputStream.read(bytes))!=-1){
                fileInputStream.read(bytes, 0, lenth);
                System.out.print(new String(bytes));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
